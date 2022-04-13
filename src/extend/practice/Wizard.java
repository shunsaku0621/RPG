package extend.practice;

public class Wizard extends Human{
	public Wizard() {
		this.name = "魔法使い";
		this.hp = 200;
		this.offensive = 30;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が魔法で攻撃！" + target.name + "に" + damage + "のダメージ！");
		target.hp -= damage;
//		System.out.println(target.getHp());
	}
}
