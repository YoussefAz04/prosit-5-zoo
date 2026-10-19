public class Main {

    public static void main(String[] args) {

        Aquatic aquatic = new Aquatic(
                "Poissons",
                "Nemo",
                2,
                false,
                "Mer"
        );

        Terrestrial terrestrial = new Terrestrial(
                "Felidae",
                "Simba",
                4,
                true,
                4
        );

        Dolphin dolphin = new Dolphin(
                "Delphinidae",
                "Flipper",
                5,
                true,
                "Océan",
                40.5f
        );

        Penguin penguin = new Penguin(
                "Spheniscidae",
                "Pingu",
                3,
                false,
                "Bassin",
                100.0f
        );

        System.out.println("Aquatic : " + aquatic);
        System.out.println("Terrestrial : " + terrestrial);
        System.out.println("Dolphin : " + dolphin);
        System.out.println("Penguin : " + penguin);

        System.out.println();

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}