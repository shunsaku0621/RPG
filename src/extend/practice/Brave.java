package extend.practice;

public class Brave extends Human{
	public Brave() {
		this.name = "勇者";
		this.hp = 200;
		this.offensive = 20;
	}
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が剣で攻撃！" + target.name + "に" + damage + "のダメージ！");
		target.hp -= damage;
//		System.out.println(target.getHp());
	}
}
