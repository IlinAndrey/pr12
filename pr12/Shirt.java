package pr12;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Shirt() {
    }

    private Shirt getShirtFromString(String str) {
        String[] shirtStr = str.split(",");
        return new Shirt(shirtStr[0], shirtStr[1], shirtStr[2], shirtStr[3]);
    }

    private Shirt[] getShirtsFromStrings(String[] arr) {
        Shirt[] shirts = new Shirt[arr.length];
        for (int i = 0; i < arr.length; i++) {
            shirts[i] = getShirtFromString(arr[i]);
        }
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] strShirts = new String[11];
        strShirts[0] = "K001,Black Polo Shirt,Black,XL";
        strShirts[1] = "K002,Black Polo Shirt,Black,L";
        strShirts[2] = "K003,Blue Polo Shirt,Blue,XL";
        strShirts[3] = "L004,Blue Polo Shirt,Blue,M";
        strShirts[4] = "L005,Tan Polo Shirt,Tan,XL";
        strShirts[5] = "M006,Black T-Shirt,Black,XL";
        strShirts[6] = "M007,Orange T-Shirt,Orange,S";
        strShirts[7] = "S008,White T-Shirt,White,L";
        strShirts[8] = "S009,Green T-Shirt,Green,S";
        strShirts[9] = "N010,White T-Shirt,White,XL";
        strShirts[10] = "N011,Maroon Polo Shirt,Maroon,S";

        Shirt shirt = new Shirt();
        Shirt[] shirts = shirt.getShirtsFromStrings(strShirts);

        for (Shirt shirtOutput : shirts) {
            System.out.println(shirtOutput);
        }
    }
}