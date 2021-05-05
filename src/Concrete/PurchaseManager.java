package Concrete;

import Abstract.PurchaseService;
import Entity.Purchase;

public class PurchaseManager implements PurchaseService {

	@Override
	public void addToCard(Purchase purchase) {
		System.out.println("Satýn alým için kart bilgilerini giriniz : " + purchase.getCrediCartNo() + " Girdiðiniz kart no ile satýn alým onaylanmýþtýr. ");
		
	}

}
