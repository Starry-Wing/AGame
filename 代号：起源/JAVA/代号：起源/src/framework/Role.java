package framework;

//�����ࣨ����
public abstract class Role {

	private String name;

	private String gender;

	private int HP;

	private Item[] items;
	
	protected Map map;
	
	private Position position=new Position();

	public void walk() {
		System.out.println("��·");
	}

	public void run() {
		System.out.println("�ܲ�");
	}
	
	public void move(int x,int y) {
		System.out.println("�Ƶ���"+"("+x+","+y+")");
		setPosition(x, y);
	}
	
	public void move(Position position) {
		System.out.println("�Ƶ���"+"("+position.x+","+position.y+")");
		this.position=position;
	}
	
	public void changeMap(Map map) {
		this.map.deleteRole(this);
		map.addRole(this);
		this.map=map;
		System.out.println("�л���ͼ��"+this.map.getName());
	}

	public void talk() {
		System.out.println("˵��");
	}

	public void talkWithOther(Role role) {
		System.out.println("��"+role.getName()+"����");
	}

	public void die() {
		System.out.println("ȥ��");
	}

	public void fight(Role role) {
		System.out.println("��"+role.getName()+"ս��");
	}

	public void addItem(InteractiveItem item) {
		System.out.println("���"+item.getName());
	}

	public void giveItem(InteractiveItem item, Role role) {
		System.out.println("��"+role.getName()+item.getName());
	}

	public void useItem(InteractiveItem item) {
		System.out.println("ʹ��"+item.getName());
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
