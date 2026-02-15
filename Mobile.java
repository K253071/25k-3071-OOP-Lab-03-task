class Phone {

    String brandName;
    String model;
    double price;

    // No-argument constructor
    Phone() {
        brandName = "Unknown";
        model = "Default Model";
        price = 0.0;
    }

    // Parameterized constructor
    Phone(String brand, String m, double p) {
        brandName = brand;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brandName);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class Mobile {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("Realme", "C61", 30000);

        phone1.display();
        phone2.display();
    }
}
