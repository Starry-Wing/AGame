package framework;

//��ҽ�ɫ
public class PlayerRole extends Role {

	public void changeMap(Map map) {
		this.map.deleteRole(this);
		this.map.setPlayerMap(false);
		map.addRole(this);
		this.map=map;
		this.map.setPlayerMap(true);
		System.out.println("�л���ͼ��"+this.map.getName());
	}
	
}
