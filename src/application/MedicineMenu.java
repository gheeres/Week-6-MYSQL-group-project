package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.MedicineDao;
import entity.Medicine;

public class MedicineMenu {
	private static int medicineId;
	private String medicinename;
	private List<Medicine> medicine;
	private int updateMedicine;
	private static MedicineDao medicineDao = new MedicineDao();
	
	static Scanner scanner = new Scanner(System.in);
	
	
  public static String showMedicines() throws SQLException {
	  System.out.println("");
	  String showMedicines = scanner.nextLine();
	  MedicineDao.showMedicine(showMedicines);
	  return showMedicines;
  }
 	  
  public static int updateMedicine() throws SQLException {
	  System.out.println("Enter Medicine Id");
	  int updateMedicine = scanner.nextInt();
	  MedicineDao.updateMedicine(medicineId);
	  return updateMedicine;
	  }
  
  public static int deleteMedicine() throws SQLException {
	  System.out.println("Enter Medicine Id");
	  int deleteMedicine = Integer.parseInt(scanner.nextLine());
	  MedicineDao.deleteMedicine(medicineId);
	  return 0;
	  
  }
  static void createMedicine() throws SQLException {
		System.out.print("Enter new Medicine name:");
		String medicineName = scanner.nextLine();
		medicineDao.createNewMedicine(medicineName);
  
}
  
  public int getMedicineId() {
	return medicineId;
  }
  
  public void setMedicineId(int medicineId) {
	this.medicineId = medicineId;
  }

  public List<Medicine> getMedicine() {
	return medicine;
  }

  public void setMedicine(List<Medicine> medicine) {
	this.medicine = medicine;
}

public int getUpdateMedicine() {
	return updateMedicine;
}

public void setUpdateMedicine(int updateMedicine) {
	this.updateMedicine = updateMedicine;
}

public String getMedicinename() {
	return medicinename;
}

public void setMedicinename(String medicinename) {
	this.medicinename = medicinename;
}
	

}

