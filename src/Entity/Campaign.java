package Entity;

import Abstract.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private double campaignPrice;
	private double discount;
	
	public Campaign() {
		super();
	}
	
	
	public Campaign(int id, String campaignName, double campaignPrice, double discount) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignPrice = campaignPrice;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public double getCampaignPrice() {
		return campaignPrice;
	}


	public void setCampaignPrice(double campaignPrice) {
		this.campaignPrice = campaignPrice;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getCampaignPriceAfterDiscount() {
		return this.campaignPrice -(this.campaignPrice*this.discount/100);
	}
}
