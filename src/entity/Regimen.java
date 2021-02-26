package entity;

import java.util.List;

public class Regimen {

	private int regimenId;
	private String dosage;
	//private List<User> user;
	//private List<Medicine> medicine;
	//not sure if this is best way for these, as place holder.

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
