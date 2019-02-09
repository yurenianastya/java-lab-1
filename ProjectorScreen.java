public class ProjectorScreen {
    public int height;
    public int width;
    public String manufacturer;
    public String typeOfBracing;
        private double diagonal;
        private double thickness;
            protected String model;
            protected boolean isColourful;
                static int price;

    public ProjectorScreen() {
        //System.out.println("Default");
    }

    public ProjectorScreen(int height, int width, String manufacturer, String typeOfBracing) {
        this();
        this.height = height;
        this.width = width;
        this.manufacturer = manufacturer;
        this.typeOfBracing = typeOfBracing;
    }
    public ProjectorScreen(int height, int width, String manufacturer, String typeOfBracing, double diagonal, double thickness, String model, boolean isColourful) {
        this(height, width, manufacturer, typeOfBracing);
        this.diagonal = diagonal;
        this.thickness = thickness;
        this.isColourful = isColourful;
        this.model = model;
    }
    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String toString() {
        String Details =
                "The Projector's Screen size is: "+height+"x"+width+"\n"+
                "Its manufacturer is: "+manufacturer+"\n"+
                "Its bracing type is: "+typeOfBracing+"\n"+
                "It has a diagonal of : "+diagonal+"\n"+
                "Its thickness is: "+thickness+"\n"+
                "The model is: "+model+"\n"+
                "Is it colourful?: "+isColourful+"\n";
        return Details;
    }
    public static void printStaticPrice(){
        price = 450;
        System.out.println("\n"+"The static price is: "+price);
    }
    
    public void printPrice() {
        price = 1938;
        System.out.println("\n"+"The static price is: "+price);
    }
    
    public void resetValues(int height, int width, String manufacturer, String typeOfBracing, double diagonal, double thickness, String model, boolean isColourful) {
        this.height = height;
        this.width = width;
        this.manufacturer = manufacturer;
        this.typeOfBracing = typeOfBracing;
        this.diagonal = diagonal;
        this.thickness = thickness;
        this.isColourful = isColourful;
        this.model = model;
    }
}
