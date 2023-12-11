public class Guest extends Person{
    private static int noGuests = 0;
    Guest(){
        ++noGuests;
    }
    Guest(String name , String email, String phone, String Address)
    {
        super(++noGuests,name,email,phone,Address);
    }



}
