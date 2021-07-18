package framework;

import java.util.ArrayList;
import java.util.List;

public class Map {
	
	private String name;

	private int length;

	private int width;

//	private Role[] roles;
//
//	private Item[] items;
	private List<Role> roles=new ArrayList<Role>();
	private List<Item> items=new ArrayList<Item>();
	

	private boolean isPlayerMap;

//	private Role role;
//
//	private Item item;
	
	private MapModel mapModel;
	
	public Map(String name, int length,int width,MapModel mapModel,boolean isPlayerMap) {
		this.name=name;
		this.length=length;
		this.width=width;
		this.mapModel=mapModel;
		this.isPlayerMap=isPlayerMap;
	}
	
	public void addRole(Role role) {
		roles.add(role);
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void deleteRole(Role role) {
		roles.remove(role);
	}
	
	public void deleteItem(Item item) {
		items.remove(item);
	}

	public boolean isPlayerMap() {
		return isPlayerMap;
	}//是否为玩家所在地图
	
	public void setPlayerMap(boolean isPlayerMap) {
		this.isPlayerMap=isPlayerMap;
	}//设置是否为玩家所在地图
	
	public void showAllRoles() {
		for (int i = 0; i < roles.size(); i++) {
			System.out.println("人物名："+roles.get(i).getName());
		}
	}
	
	public void showAllItems() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println("道具名:"+items.get(i).getName());
			
		}
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

}
