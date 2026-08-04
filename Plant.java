public class Plant {
    public byte age;
    public short length;
    public int width;
    public long levelCO2;
    public double levelWater;
    public float levelOxygen;
    public boolean isMostlyGreen;
    public char stemHardOrSoft;

    public Plant(byte age, short length, int width, long levelCO2, double levelWater, float levelOxygen, boolean isMostlyGreen, char stemHardOrSoft) {
        this.age = age;
        this.length = length;
        this.width = width;
        this.levelCO2 = levelCO2;
        this.levelWater = levelWater;
        this.levelOxygen = levelOxygen;
        this.isMostlyGreen = isMostlyGreen;
        this.stemHardOrSoft = stemHardOrSoft;
    }

    public void plantWave() {
        System.out.println("Hi! I am a plant and I'm waving!");
    }

    public void photosynthesis() {
        System.out.println("The plant is performing photosynthesis.");
        System.out.println("It is using sunlight, water, and carbon dioxide to make food and release oxygen.");
    }

    public void cellularRespiration() {
        System.out.println("The plant is performing cellular respiration.");
        System.out.println("It is breaking down glucose with oxygen to produce energy, carbon dioxide, and water.");
    }

    public float getO2() {
        return levelOxygen;
    }

    public void displayCO2() {
        System.out.println("CO2 Level: " + levelCO2);
    }

    public double getWater() {
        return levelWater;
    }

    public byte getAge() {
        return age;
    }

    public void displayLength() {
        System.out.println("Length: " + length);
    }
}