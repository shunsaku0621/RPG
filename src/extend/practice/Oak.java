package extend.practice;

public class Oak extends Monster{
	protected String name;
	protected int hp;
	protected int offensive;

	public Oak() {
		this.name = "オーク";
		this.hp = 200;
		this.offensive = 20;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が槍で攻撃！"+ target.getName() + "に" + damage +  "のダメージ！");
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
