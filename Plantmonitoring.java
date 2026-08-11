import java.util.Scanner;

public class Plantmonitoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        byte age = input.nextByte();

        System.out.print("Enter length: ");
        short length = input.nextShort();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter CO2 level: ");
        long levelCO2 = input.nextLong();

        System.out.print("Enter water level: ");
        double levelWater = input.nextDouble();

        System.out.print("Enter oxygen level: ");
        float levelOxygen = input.nextFloat();

        System.out.print("Is the plant mostly green? (true/false): ");
        boolean isMostlyGreen = input.nextBoolean();

        System.out.print("Enter stem type (H = Hard, S = Soft): ");
        char stemHardOrSoft = input.next().charAt(0);

        Plant plant = new Plant(
            age,
            length,
            width,
            levelCO2,
            levelWater,
            levelOxygen,
            isMostlyGreen,
            stemHardOrSoft
        );

        System.out.println();
        plant.plantWave();
        plant.photosynthesis();
        plant.cellularRespiration();

        System.out.println();
        System.out.println("Age: " + plant.getAge());
        System.out.println("Oxygen Level: " + plant.getO2());
        System.out.println("Water Level: " + plant.getWater());
        plant.displayCO2();
        plant.displayLength();

        input.close();
    }
}