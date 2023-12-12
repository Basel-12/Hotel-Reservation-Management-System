public class Guest extends Person{
    private static int noGuests = FileHandler.nousers("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Guest.txt");
    Guest(){
        ++noGuests;
    }
    Guest(String name , String email, String phone, String Address)
    {
        super(++noGuests,name,email,phone,Address);
    }



}
