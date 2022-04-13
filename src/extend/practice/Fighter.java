package extend.practice;

public class Fighter extends Human{
	public Fighter() {
		this.name = "戦士";
		this.hp = 200;
		this.offensive = 40;
	}
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が斧で攻撃！" + target.name+ "に" + damage + "のダメージ！");
		target.hp -= damage;
//		System.out.println(target.getHp());
	}
}
