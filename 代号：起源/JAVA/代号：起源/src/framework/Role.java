package framework;

//人物类（抽象）
public abstract class Role {

	private String name;

	private String gender;

	private int HP;

	private Item[] items;
	
	protected Map map;
	
	private Position position=new Position();

	public void walk() {
		System.out.println("走路");
	}

	public void run() {
		System.out.println("跑步");
	}
	
	public void move(int x,int y) {
		System.out.println("移到至"+"("+x+","+y+")");
		setPosition(x, y);
	}
	
	public void move(Position position) {
		System.out.println("移到至"+"("+position.x+","+position.y+")");
		this.position=position;
	}
	
	public void changeMap(Map map) {
		this.map.deleteRole(this);
		map.addRole(this);
		this.map=map;
		System.out.println("切换地图至"+this.map.getName());
	}

	public void talk() {
		System.out.println("说话");
	}

	public void talkWithOther(Role role) {
		System.out.println("与"+role.getName()+"交流");
	}

	public void die() {
		System.out.println("去世");
	}

	public void fight(Role role) {
		System.out.println("与"+role.getName()+"战斗");
	}

	public void addItem(InteractiveItem item) {
		System.out.println("获得"+item.getName());
	}

	public void giveItem(InteractiveItem item, Role role) {
		System.out.println("给"+role.getName()+item.getName());
	}

	public void useItem(InteractiveItem item) {
		System.out.println("使用"+item.getName());
		item.useResult();
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getHP() {
		return HP;
	}
	
	public Position getPosition() {
		return position;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setGender(String gender) {
		this.gender=gender;
	}

	public void setHP(int HP) {
		this.HP=HP;
	}
	
	public void setPosition(int x,int y) {
		position.x=x;
		position.y=y;
	}
	
	public void setMap(Map map) {
		this.map=map;
	}

}
