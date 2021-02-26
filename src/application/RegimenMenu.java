package application;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.RegimenDao;
import entity.Regimen;

public class RegimenMenu {
	
	
	private static Scanner scanner = new Scanner(System.in);
	private static RegimenDao regimenDao = new RegimenDao();
	
	
	/*	
	 * this is a bungle
	
	*/
	 public static void showUserRegimen() throws SQLException {
		 System.out.print("Enter User ID: ");
		 int id = Integer.parseInt(scanner.nextLine());
		 
	  List<Regimen> regimen = regimenDao.getUserRegimen(id);
	  
	  for (Regimen med : regimen) {
		  System.out.println(med.getMedId() + ": " + med.getMedId() + " " + med.getDosage());
	  }
  }
 
	
	/*
	public static void showUserRegimen() throws SQLException {
		System.out.print("Enter User ID: ");
		int id = Integer.parseInt(scanner.nextLine());
		Regimen regimen = regimenDao.getUserRegimen(id);
		System.out.println(regimen.getMedId() + ": " + regimen.getDosage());
		
	}*/
  public static void createRegimen() {
  }

  public static void updateUserRegimen() {
  }

  public static void deleteRegimen() {
  }
}
