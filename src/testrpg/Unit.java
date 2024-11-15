package testrpg;

abstract public class Unit {

	private String name;
	private int hp;
	private int maxHp;
	private int mp;
	private int shield;
	private int power;
	private int skill;
	boolean party;

    public Unit (){}
    
	
	public Unit(String name, int hp, int maxHp, int mp, int shield, int power, int skill) {
		super();
		this.name = name;
		this.hp = hp;
		this.maxHp = maxHp;
		this.mp = mp;
		this.shield = shield;
		this.power = power;
		this.skill = skill;
	}
	
	public Unit(String name, int hp,  int mp, int shield, int power, int skill, boolean party) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.shield = shield;
		this.power = power;
		this.skill = skill;
		this.party = party;
	}
	
	public Unit(String name, int hp,  int mp, int shield, int power, int skill) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.shield = shield;
		this.power = power;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public abstract void attack(Unit unit);

}
