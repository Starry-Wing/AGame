public abstract class Role {

	private String name;

	private String gender;

	private int HP;

	private Item[] items;

	public void walk() {

	}

	public void run() {

	}

	public void talk() {

	}

	public void talkWithOther(Role role) {

	}

	public void die() {

	}

	public void fight(Role role) {

	}

	public void addItem(Item item) {

	}

	public void giveItem(Item item, Role role) {

	}

	public void useItem(Item item) {

	}

	public String getName() {
		return null;
	}

	public String getGender() {
		return null;
	}

	public int getHP() {
		return 0;
	}

	public void setName(String name) {

	}

	public void setGender(String gender) {

	}

	public void setHP(int HP) {

	}

}
