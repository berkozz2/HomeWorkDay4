package Concrete;

import Abstract.PurchaseService;
import Entity.Purchase;

public class PurchaseManager implements PurchaseService {

	@Override
	public void addToCard(Purchase purchase) {
		System.out.println("Sat�n al�m i�in kart bilgilerini giriniz : " + purchase.getCrediCartNo() + " Girdi�iniz kart no ile sat�n al�m onaylanm��t�r. ");
		
	}

}
