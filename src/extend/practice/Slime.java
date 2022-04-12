package extend.practice;

public class Slime extends Monster{
	protected String name = "スライム";
	protected int hp = 200;
	protected int offensive = 30;

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が体当たりで攻撃！"+ target.getName() + "に" + damage +  "のダメージ！");
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
