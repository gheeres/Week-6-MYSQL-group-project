package application;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.RegimenDao;
import entity.Regimen;

public class RegimenMenu {
	
	
	private static Scanner scanner = new Scanner(System.in);
	private static RegimenDao regimenDao = new RegimenDao();
	

	 public static void showUserRegimen() throws SQLException {
		 System.out.print("Enter User ID: ");
		 int id = Integer.parseInt(scanner.nextLine());
		 
	  List<Regimen> regimen = regimenDao.getUserRegimen(id);
	  
	  for (Regimen med : regimen) {
		  System.out.println(med.getMedId() + ": " + med.getMedId() + " " + med.getDosage());
	  }
  }
 
	
  public static void createRegimen() throws SQLException {
	  System.out.print("Enter new regimen info: \n");
	  System.out.println("Enter medicine id: ");
	  int medId = Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter user id: ");
	  int userId = Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter dosage: ");
	  String dosage = scanner.nextLine();
	  
	  regimenDao.createNewRegimen(medId, userId, dosage);
		
  }

  public static void updateUserRegimen() {
  }

  public static void deleteRegimen() {
  }
}
