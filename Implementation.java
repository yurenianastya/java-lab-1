public class Implementation extends ProjectorScreen  {
    public static void main(String[] args) {
        ProjectorScreen smartXiaomiScreen = new ProjectorScreen(13, 18, "Xiaomi", "Wall", 16.8,
                5.2, "DD163", true);
        ProjectorScreen iProjectorScreen = new ProjectorScreen();
        ProjectorScreen anotherProjectorScreen = new ProjectorScreen(10, 13,
                "BenQ", "Standing/Wall");
        System.out.println("First one: " + smartXiaomiScreen.toString());
        System.out.println("Second one: " + iProjectorScreen.toString());
        System.out.println("Third one: " + anotherProjectorScreen.toString());
        ProjectorScreen objectForResetting = new ProjectorScreen();
        objectForResetting.resetValues(10,25,"Bosch","Standing", 19.0,
                3.5, "GHOK28381", false);
        System.out.println("Resetted values: "+objectForResetting.toString());
        printStaticPrice();
        ProjectorScreen objectForMethod = new ProjectorScreen();
        objectForMethod.printPrice();
    }
}
