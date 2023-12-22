package ploy_game;

public class StageTitle implements Stage {

	@Override
	public boolean update() {
		System.out.println("==== TEXT RPG ====");
		System.out.println("아무 키나 입력하세요");
		String start = GameManager.scan.nextLine();
		if (start != null)
		GameManager.nextStage = "LOBBY";
		return false;
	}
	
	@Override
	public void init() {
		
	}

}