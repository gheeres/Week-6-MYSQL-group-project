package application;

public class MedicineMenu {

  public static void showMedicines() {
 
	  String selection = "2";
	  
	  do {
		  printMenu();
		  selection = scanner.nextline();
		  
		  if (selection.equals("2")) {
			  
			  displayMeedicine
			  }
		  while (!selection.equals("-1"));
	  }
  }
  
  public static void createMedicine() {
  }

  public static void updateMedicine() {
  }

  public static void deleteMedicine() {
  }
}
