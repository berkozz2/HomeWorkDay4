package UI;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.PurchaseManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;
import Entity.Purchase;

public class Main {

	public static void main(String[] args) {

		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		PurchaseManager purchaseManager = new PurchaseManager();

		Player player1 = new Player();
		Player player2 = new Player();

		Game game1 = new Game();
		Game game2 = new Game();
		
		

		Campaign campaign1 = new Campaign();
		Campaign campaign2 = new Campaign();

		Purchase purchase = new Purchase();

		player1.setId(1);
		player1.setFirstName("Berk");
		player1.setLastName("Ozmenekse");
		player1.setNationalityIdentity("123456789");
		player1.setBirthDate("16.05.1990");

		player2.setId(2);
		player2.setFirstName("Burak");
		player2.setLastName("Ozmenekse");
		player2.setNationalityIdentity("123456666");
		player2.setBirthDate("26.04.1990");

		game1.setId(1);
		game1.setGameName("Dota2");
		game1.setUnitPrice(400);

		game2.setId(2);
		game2.setGameName("Lol");
		game2.setUnitPrice(300);
		
		Game[] games = {game1,game2};

		campaign1.setId(1);
		campaign1.setCampaignName("Cok al az ode");
		campaign1.setCampaignPrice(500);
		campaign1.setDiscount(50);

		campaign2.setId(2);
		campaign2.setCampaignName("Batan geminin mallarý bunlar");
		campaign2.setCampaignPrice(400);
		campaign2.setDiscount(30);

		purchase.setId(1);
		purchase.setCrediCartNo("2266 5566 8899 7799");

		playerManager.add(player1);
		System.out.println("---------------------");
		
		playerManager.register(player1);
		System.out.println("-------------------");
		
		gameManager.getAll(games);
		System.out.println("-------------------");

		campaignManager.add(campaign1);

		System.out.println(campaign1.getCampaignPriceAfterDiscount() + " : TL indirim uygulandý.");
		System.out.println("-----------------------");

		gameManager.sell(game1, player1, campaign1);
		System.out.println("------------------------");

		purchaseManager.addToCard(purchase);

	}

}
