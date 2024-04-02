public class ComputerFactoryMain {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2028", "Dell", "260");
        Monitor monitor = new Monitor("27 inch", "Acer", 27, "1920 x 1080");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("Razor-R2", "Razor", computerCase, monitor, motherboard);

//        thePC.getMonitor().drawPixelAt(2, 2, "blue");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}
