package extend.practice;

public abstract class Living {
	protected String name; //キャラクターの名前
	protected int hp;       //ヒットポイント
	protected int offensive; //攻撃力

	abstract void attack(Living target); //ターゲットに攻撃するメソッド
	abstract String getName();
	public int setHp(int damage) {
		return this.hp-=damage;
	}
	abstract int getHp();
}
