package framework;

//玩家角色
public class PlayerRole extends Role {

	public void changeMap(Map map) {
		this.map.deleteRole(this);
		this.map.setPlayerMap(false);
		map.addRole(this);
		this.map=map;
		this.map.setPlayerMap(true);
		System.out.println("切换地图至"+this.map.getName());
	}
	
}
