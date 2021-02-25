package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList("Show Users", "Show all Medicines", "Show a User Regimen",
			"Create User", "Create Medicine", "Create Regimen", "Update User", "Update Medicine", "Update User Regimen",
			"Delete User", "Delete Medicine", "Delete Regimen");

	public void start() {
		String selection = "";

		do {
			printMenu();
			selection = scanner.nextLine();

			try {
				if (selection.equals("1")) {
					UserMenu.showUsers();
				} else if (selection.equals("2")) {
					MedicineMenu.showMedicines();
				} else if (selection.equals("3")) {
					RegimenMenu.showUserRegimen();
				} else if (selection.equals("4")) {
					UserMenu.createUser();
				} else if (selection.equals("5")) {
					MedicineMenu.createMedicine();
				} else if (selection.equals("6")) {
					RegimenMenu.createRegimen();
				} else if (selection.equals("7")) {
					UserMenu.updateUser();
				} else if (selection.equals("8")) {
					MedicineMenu.updateMedicine();
				} else if (selection.equals("9")) {
					RegimenMenu.updateUserRegimen();
				} else if (selection.equals("10")) {
					UserMenu.deleteUser();
				} else if (selection.equals("11")) {
					MedicineMenu.deleteMedicine();
				} else if (selection.equals("12")) {
					RegimenMenu.deleteRegimen();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("Press enter to continue.......");
			scanner.nextLine();

		} while (!selection.equals("-1"));
	}

	private void printMenu() {
		System.out.println("Select an Option:\n-----------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
		}
	}

}
