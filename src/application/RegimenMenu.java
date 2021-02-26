package application;


import java.sql.SQLException;
import java.util.List;

import dao.RegimenDao;
import entity.Regimen;

public class RegimenMenu {
	
	private static RegimenDao regimenDao;
			
	public static void showUserRegimen() throws SQLException {
	  List<Regimen> regimen = regimenDao.getUserRegimen();
	  
	  for (Regimen med : regimen) {
		  System.out.println(med.getMedId() + ": " + med.getMedId() + " " + med.getDosage());
	  }
  }
  
  public static void createRegimen() {
  }

  public static void updateUserRegimen() {
  }

  public static void deleteRegimen() {
  }
}
