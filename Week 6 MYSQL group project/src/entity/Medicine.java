package entity;

public class Medicine {

	private int medicineId;
	private String medicineName;
	private String usage;

	public Medicine(int medicineId, String medicineName, String usage) {
		this.setMedicineId(medicineId);
		this.setMedicineName(medicineName);
		this.setUsage(usage);
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

}
