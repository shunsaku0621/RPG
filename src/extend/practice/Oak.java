package extend.practice;

public class Oak extends Monster{
	public Oak() {
		this.name = "オーク";
		this.hp = 200;
		this.offensive = 20;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が槍で攻撃！"+ target.name + "に" + damage +  "のダメージ！");
		target.hp -= damage;
//		System.out.println(target.getHp());
	}
}
