import java.util.*;
public class Reservation {
    private static int reservationId = FileHandler.nousers("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Reservation.txt");
    private Date checkIN;
    private Date checkOut;
    private int roomId;
    private int guestId;
    private boolean status;
    Reservation(){
        reservationId++;
    }
    Reservation(Date checkOut,int roomId,int guestId,boolean status){
        reservationId++;
        checkIN = new Date();
        this.checkOut = checkOut;
        this.roomId = roomId;
        this.guestId = guestId;
        this.status = status;
    }
    
}
