package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entity.Player;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player entity) {
		System.out.println("Player has been add : " + entity.getFirstName());
		
	}

	@Override
	public void delete(Player entity) {
		System.out.println("PLayer has been delete : " + entity.getFirstName());
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Player has been update by system : " + entity.getFirstName());
		
	}

	@Override
	public void register(Player player) {
		if(playerCheckService.isRealPerson("Berk", "Ozmenekse", "123456789", "16.05.1990")) {
			System.out.println("Giriþ Baþarýlý : " + player.getFirstName());
		}else {
			System.out.println("Giriþ baþarýsýz tekrar deneyiniz.");
		}
		
	}

}
