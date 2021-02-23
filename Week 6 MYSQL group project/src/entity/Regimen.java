package entity;

public class Regimen {

	private int regimenId;
	private String dosage;

	public Regimen(int regimenId, String dosage) {
		this.setRegimenId(regimenId);
		this.setDosage(dosage);
	}

	public int getRegimenId() {
		return regimenId;
	}

	public void setRegimenId(int regimenId) {
		this.regimenId = regimenId;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

}
