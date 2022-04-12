package extend.practice;

public class Brave extends Human{
	protected String name;
	protected int hp;
	protected int offensive;
	
	public Brave() {
		this.name = "勇者";
		this.hp = 200;
		this.offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が斧で攻撃！" + target.getName() + "に" + damage + "のダメージ！");
		target.setHp(damage);
//		System.out.println(target.getHp());
	}
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int setHp(int damage) {
		return this.hp -= damage;
//		System.out.println(this.hp);
	}
	@Override
	public int getHp() {
		return this.hp;
	}
}
