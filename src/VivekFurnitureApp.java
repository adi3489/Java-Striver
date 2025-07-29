import java.util.Scanner;

// CustomerDetails class
class CustomerDetails {
    private String customerName;
    private long phoneNumber;
    private String address;

    public CustomerDetails(String customerName, long phoneNumber, String address) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public long getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

// Abstract class Bero
abstract class Bero {
    protected String beroType;
    protected String beroColour;
    protected double price;

    public Bero(String beroType, String beroColour) {
        this.beroType = beroType;
        this.beroColour = beroColour;
    }

    public String getBeroType() { return beroType; }
    public void setBeroType(String beroType) { this.beroType = beroType; }

    public String getBeroColour() { return beroColour; }
    public void setBeroColour(String beroColour) { this.beroColour = beroColour; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract void calculatePrice();
}

// SteelBero class
class SteelBero extends Bero {
    private int beroHeight;

    public SteelBero(String beroType, String beroColour, int beroHeight) {
        super(beroType, beroColour);
        this.beroHeight = beroHeight;
    }

    public int getBeroHeight() { return beroHeight; }
    public void setBeroHeight(int beroHeight) { this.beroHeight = beroHeight; }

    public void calculatePrice() {
        if (beroHeight == 3) {
            setPrice(5000);
        } else if (beroHeight == 5) {
            setPrice(8000);
        } else if (beroHeight == 7) {
            setPrice(10000);
        }
    }
}

// WoodenBero class
class WoodenBero extends Bero {
    private String woodType;

    public WoodenBero(String beroType, String beroColour, String woodType) {
        super(beroType, beroColour);
        this.woodType = woodType;
    }

    public String getWoodType() { return woodType; }
    public void setWoodType(String woodType) { this.woodType = woodType; }

    public void calculatePrice() {
        if (woodType.equals("Ply Wood")) {
            setPrice(15000);
        } else if (woodType.equals("Teak Wood")) {
            setPrice(12000);
        } else if (woodType.equals("Engineered Wood")) {
            setPrice(10000);
        }
    }
}

// Discount class
class Discount {
    public double calculateDiscount(Bero bObj) {
        if (bObj instanceof SteelBero) {
            return bObj.getPrice() * 0.10;
        } else if (bObj instanceof WoodenBero) {
            return bObj.getPrice() * 0.15;
        }
        return 0;
    }
}

// Main Class - UserInterface
public class VivekFurnitureApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Customer Details
        System.out.println("Enter Customer Name");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number");
        long phone = Long.parseLong(sc.nextLine());
        System.out.println("Enter address");
        String address = sc.nextLine();

        CustomerDetails customer = new CustomerDetails(name, phone, address);

        // Input Bero Type
        System.out.println("Enter Bero Type");
        String beroType = sc.nextLine();

        Bero bero = null;

        if (beroType.equals("Steel Bero")) {
            System.out.println("Enter Bero Colour");
            String colour = sc.nextLine();
            System.out.println("Enter Bero Height");
            int height = Integer.parseInt(sc.nextLine());
            bero = new SteelBero(beroType, colour, height);
        } else if (beroType.equals("Wooden Bero")) {
            System.out.println("Enter Bero Colour");
            String colour = sc.nextLine();
            System.out.println("Enter Wood Type");
            String wood = sc.nextLine();
            bero = new WoodenBero(beroType, colour, wood);
        } else {
            System.out.println(beroType + " is an invalid bero type");
            return;
        }

        // Calculate price and discount
        bero.calculatePrice();
        Discount d = new Discount();
        double discount = d.calculateDiscount(bero);
        double total = bero.getPrice() - discount;

        // Output final amount
        System.out.printf("Amount needs to be paid %.2f", total);
    }
}

