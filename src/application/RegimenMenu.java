package application;

<<<<<<< HEAD
import java.util.Scanner;

public class RegimenMenu {
	
	private Scanner scanner = new Scanner(System.in);
	
  public static void showUserRegimen() {
	 
  }
  
  public static void createRegimen() {
  }
=======

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
			 System.out.println(med.getRegimenId()+ ": " + med.getMedName() + " " + med.getDosage());
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
>>>>>>> f8595f132faf0de21b125a784396f8b1df05628d

  public static void updateUserRegimen() throws SQLException {
	  System.out.print("Enter regimen ID to update: ");
	  int id = Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter updated medicine id: ");
	  int medId = Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter updated user id: ");
	  int userId = Integer.parseInt(scanner.nextLine());
	  System.out.println("Enter updated dosage: ");
	  String dosage = scanner.nextLine();
	  
	  regimenDao.updatedRegimenById(medId, userId, dosage, id);
  }

  public static void deleteRegimen() throws SQLException {
	  System.out.print("Enter regimen id ot delete: ");
	  int id = Integer.parseInt(scanner.nextLine());
	  
	  regimenDao.deleteRegimenById(id);
  }
}
