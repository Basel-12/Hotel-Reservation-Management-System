public class Employee extends Person {
    private static int noEmployees = FileHandler.nousers("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Employees.txt");
    private String position;
    private double salary;

    Employee(){
        this("","","","","",0);
    }
    Employee(String name , String email, String phone, String Address,String position, double salary){
        super(++noEmployees,name,email,phone,Address);
        this.position = position;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void SetPosition(String position){
        this.position = position;
    }

    public static int getNoEmployees() {
        return noEmployees;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition()
    {
        return position;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPosition: " + position + "\nSalary: " + salary;
    }
}
