package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Player;

public interface GameService extends BaseService<Game> {
	
	public void sell(Game game, Player player, Campaign campaign);
	
	public void getAll(Game[] game);
}
