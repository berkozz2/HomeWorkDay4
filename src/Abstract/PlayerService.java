package Abstract;

import Entity.Player;

public interface PlayerService extends BaseService<Player> {
	public void register(Player player);
}
