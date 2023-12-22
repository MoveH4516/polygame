package ploy_game;

public class Player extends Unit {
	enum status{
		양호,기절,침묵
	}
	
	private int healerPower;
	private status statusEffect;
	
	public status getStatusEffect() {
		return statusEffect;
	}

	public void setStatusEffect(status statusEffect) {
		this.statusEffect = statusEffect;
	}

	public Player(String na, int max, int pow) {
		super(na, max, pow);
		statusEffect = status.양호;
	}

	public void skill(Player p, int index, Unit mon) {
		if (index == 0) {
			System.out.println(p.name + " 스킬 발동 1.5배 데미지로 공격");
			int temp = p.power;
			p.power += p.power / 2;
			p.attack(mon);
			p.power = temp;
		} else if (index == 1) {
			System.out.println(p.name + " 스킬 발동 자신의 공격력 영구적으로 5 증가");
			p.power += 5;
		} else {
			System.out.println(p.name + " 스킬 발동 아군 체력 자신의 공격력에 10% 만큼 회복");
			healerPower = p.power;
		}
	}

	public void heal(Player player) {
		player.curhp += healerPower / 10;
		if (player.curhp > player.maxhp) player.curhp = player.maxhp;
	}
	
	public boolean sturn() {
		return true;
	}
	
	
	
}