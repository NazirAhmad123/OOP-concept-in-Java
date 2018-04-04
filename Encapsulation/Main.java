package Encapsulation;

public class Main {
	public static void main(String[] args) {

//		Player player = new Player();
//		player.name = "Ali";
//		player.health = 20;
//		player.weapon = "sword";
//
////		Let's try some test
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health: " + player.remainingHealth());
//
//
//		damage = 15;
//		player.health =200;
//		player.loseHealth(damage);
//		System.out.println("Remaining health: " + player.remainingHealth());

		EnhancedPlayer player = new EnhancedPlayer("ali",500,"sword");
		System.out.println("Initial health is " + player.getHealth());
	}
}
