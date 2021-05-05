package Entity;

import Abstract.Entity;

public class Purchase implements Entity {
	private int id;
	private String crediCartNo;
	
	public Purchase() {
		super();
	}
	
	public Purchase(int id, String crediCartNo) {
		this.id = id;
		this.crediCartNo = crediCartNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCrediCartNo() {
		return crediCartNo;
	}

	public void setCrediCartNo(String crediCartNo) {
		this.crediCartNo = crediCartNo;
	}
}
