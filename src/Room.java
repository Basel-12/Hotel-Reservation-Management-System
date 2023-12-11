public class Room {
    private  static int counter = 0;
   private int No = 0;
   private boolean status;
   private double price;
   private Service[] services;

   Room()
   {
       this(false,0,null);
   }

   Room(boolean status,double price,Service[] services)
   {
       this.No = ++counter;
       this.services = services;
       this.status = status;
       this.price = price;
   }
    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public boolean isAvaliable() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

@Override
    public String toString() {
    return "RoomNumber: " + No + "\nAvaliable: " + status + "\nPrice: "+ price + "\nServices: " + services;
}


}
