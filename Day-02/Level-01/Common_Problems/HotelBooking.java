public class HotelBooking {
    public String guestName;
    public String roomType;
    public int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

   // @Override
    public String toString() {
        return "HotelBooking{guestName='" + guestName + "', roomType='" + roomType + "', nights=" + nights + "}";
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking(); // Default booking
        HotelBooking b2 = new HotelBooking("John Doe", "Deluxe", 3); // Parameterized booking
        HotelBooking b3 = new HotelBooking(b2); // Copy booking

        System.out.println(b1);    // Output: HotelBooking{guestName='Unknown', roomType='Standard', nights=1}
        System.out.println(b2);    // Output: HotelBooking{guestName='John Doe', roomType='Deluxe', nights=3}
        System.out.println(b3);    // Output: HotelBooking{guestName='John Doe', roomType='Deluxe', nights=3}
    }
}
