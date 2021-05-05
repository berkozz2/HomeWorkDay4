package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign entity) {
		System.out.println("Yeni kampayam�z eklenmi�tir. Kampanya ismi ve Fiyat� a�a��dad�r => " +  entity.getCampaignName() + " , " + entity.getCampaignPrice() + "  TL "  );
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("This campaign was delete  : " + entity.getCampaignName());
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("This campaign was update : " + entity.getCampaignName() + " : change price 30 discount. " );
		
	}

}
