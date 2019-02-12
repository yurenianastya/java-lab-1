public class ProjectorScreen {
    private int height;
    private int width;
    private String manufacturer;
    private String typeOfBracing;
    private double diagonal;
    private double thickness;
        protected String model;
        protected boolean isColourful;
            static int price;

    public ProjectorScreen() {
        //System.out.println("Default");
    }

    public ProjectorScreen(int height, int width, String manufacturer, String typeOfBracing) {
        this(height, width, manufacturer, typeOfBracing, 0.0, 0.0, null, false);
    }
    public ProjectorScreen(int height, int width, String manufacturer, String typeOfBracing,
                           double diagonal, double thickness, String model, boolean isColourful) {
        this.height = height;
        this.width = width;
        this.manufacturer = manufacturer;
        this.typeOfBracing = typeOfBracing;
        this.diagonal = diagonal;
        this.thickness = thickness;
        this.isColourful = isColourful;
        this.model = model;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getTypeOfBracing() {
        return typeOfBracing;
    }

    public void setTypeOfBracing(String typeOfBracing) {
        this.typeOfBracing = typeOfBracing;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
    @Override
    public String toString() {
        return "ProjectorScreen{" +
                "height=" + height +
                ", width=" + width +
                ", manufacturer='" + manufacturer + '\'' +
                ", typeOfBracing='" + typeOfBracing + '\'' +
                ", diagonal=" + diagonal +
                ", thickness=" + thickness +
                ", model='" + model + '\'' +
                ", isColourful=" + isColourful +
                '}';
    }

    public static void printStaticPrice() {
        price = 450;
        System.out.println("\n"+"The static price is: "+price);
    }

    public void printPrice() {
        price = 1938;
        System.out.println("\n"+"Another static price is: "+price);
    }

    public void resetValues(int height, int width, String manufacturer, String typeOfBracing,
                            double diagonal, double thickness, String model, boolean isColourful) {
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
