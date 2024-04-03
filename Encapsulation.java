public class Encapsulation {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        player.loseHealth(20);

        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("WQA", 120, "Axe");

        System.out.println("Remaining Health = " + enhancedPlayer.healthRemaining());
    }
}
