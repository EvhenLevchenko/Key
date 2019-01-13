package Three.Switch.Enum;

public class Main {
    public static void main(String[] args) {
        Clothes Tshirt = new Clothes(100, "red", Size.Small);

        switch (Tshirt.clothesSize) {
            case Small:
                System.out.println("Ad");
                break;
            case Meddium:
                System.out.println("Ni");
                break;
            case Large:
                System.out.println("Pu");
                break;
            case XL:
                System.out.println("Armo");
                break;
        }
    }
}

class Clothes {
   private double cost;
    private String colour;
    Size clothesSize;

     Clothes(double cost, String colour, Size clothesSize) {
        this.cost = cost;
        this.colour = colour;
        this.clothesSize = clothesSize;
    }
}

enum Size {
    Small,
    Meddium,
    Large,
    XL
}
