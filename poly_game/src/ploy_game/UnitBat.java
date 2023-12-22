package ploy_game;

import ploy_game.Player.status;

public class UnitBat extends Unit {
	UnitBat() {
		name = "박쥐";
	}

	void skill(Player target) {
		System.out.println(name + " 스킬 발동 적 한명에게 침묵 시전 ");
		target.setStatusEffect(status.침묵);
	}
}