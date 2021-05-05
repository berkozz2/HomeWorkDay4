package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign entity) {
		System.out.println("Yeni kampayamýz eklenmiþtir. Kampanya ismi ve Fiyatý aþaðýdadýr => " +  entity.getCampaignName() + " , " + entity.getCampaignPrice() + "  TL "  );
		
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
