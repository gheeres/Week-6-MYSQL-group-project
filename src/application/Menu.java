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
					// showUsers();
				} else if (selection.equals("2")) {
					// showMedicines();
				} else if (selection.equals("3")) {
					// showUserRegimen();
				} else if (selection.equals("4")) {
					// createUser();
				} else if (selection.equals("5")) {
					// createMedicine();
				} else if (selection.equals("6")) {
					// createRegimen();
				} else if (selection.equals("7")) {
					// updateUser();
				} else if (selection.equals("8")) {
					// updateMedicine();
				} else if (selection.equals("9")) {
					// updateUserRegimen();
				} else if (selection.equals("10")) {
					// deleteUser();
				} else if (selection.equals("11")) {
					// deleteMedicine();
				} else if (selection.equals("12")) {
					// deleteRegimen();
				}
			} catch (SQLException e) {
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
