package ploy_game;

import ploy_game.Player.status;

public class UnitOrc extends Unit {
	UnitOrc() {
		name = "오크";
	}

	void skill(Player target, Unit m) {
		System.out.println(name + " 스킬 발동 한명에게 2배의 데미지 + 기절 ");
		int temp = power;
		power *= 2;
		m.attack(target);
		power = temp;
		target.setStatusEffect(status.기절);
	}
}