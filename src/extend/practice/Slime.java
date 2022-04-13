package extend.practice;

public class Slime extends Monster{
	public Slime() {
		this.name = "スライム";
		this.hp = 200;
		this.offensive = 30;
	}
	
	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		System.out.println(this.name + "が体当たりで攻撃！"+ target.name + "に" + damage +  "のダメージ！");
		target.hp -= damage;
//		System.out.println(target.getHp());
	}
}
