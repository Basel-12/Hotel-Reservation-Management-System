public class Service {
    private static int noServices = 0;
    public Service(){}
    public Service(String name,boolean status, double price){
        this.name=name;
        this.id= ++noServices;
        this.status=status;
        this.price=price;
    }
    static int use=1; // will be incremented when new object is instantiated

    private String name;
    private boolean status;
    private double price;
    private int id;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public boolean getStatus(){
        return status;
    }
    public double getPrice(){
        return price;
    }
    public void getUsage(){
        System.out.println("this service is used for : "+ use);
        System.out.println("and total benefits of this service is :"+use*price);
    }
    @Override
    public String toString(){
        return "Id: " + id + "\nName: " + name + "\nStatus: " + status + "\nPrice: " + price;
    }
}
