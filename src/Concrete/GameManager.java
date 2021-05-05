package Concrete;

import Abstract.GameService;
import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public class GameManager implements GameService{

	@Override
	public void add(Game entity) {
		System.out.println(entity.getId() + " , " + entity.getGameName() + " , " + entity.getUnitPrice() + " : This game was add by GameDeveloper.");
		
	}

	@Override
	public void delete(Game entity) {
		System.out.println(entity.getId()+ " , " + entity.getGameName() + "This game was delete.");
		
	}

	@Override
	public void update(Game entity) {
		System.out.println(entity.getGameName() + " : That game was update by Steam.");
		
	}
	
	@Override
	public void sell(Game game, Player player, Campaign campaign) {
		System.out.println(game.getGameName() + "  " + "isimli oyun Steam tarafýndan" + "  " +player.getFirstName() + "  adlý oyuncuya" + "  " + campaign.getCampaignName() + "  " + " isimli kampanya uygulanarak satýlmýþtýr.") ;
	}

	@Override
	public void getAll(Game[] game) {
		for (Game games : game) {
			System.out.println("Oyunlar : " + games.getGameName());
		}
		
	}

}
