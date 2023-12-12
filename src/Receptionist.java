import java.io.*;
import java.util.*;

public class Receptionist extends Person{
   Receptionist(){
       super();
   }
   Receptionist(int SSnn , String name , String email, String phone, String Address)
   {
       super(SSnn,name,email,phone,Address);
   }

   public  boolean addEmployee (Employee E) // add employee by employee object in file
   {
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Employees.txt");
            if (!file.exists())
                throw new IOException("File not exists");
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(E.getSSnn() + ", ");
            pw.print(E.getName() + ", ");
            pw.print(E.getEmail() + ", ");
            pw.print(E.getPhone() + ", ");
            pw.print(E.getAddress() + ", ");
            pw.print(E.getPosition() + ", ");
            pw.println(E.getSalary());
            pw.flush();
            pw.close();
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
       return true;
   }

   public boolean deleteEmployee(int SSnn){

       try {
           File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Employees.txt");
           if (!file.exists())
               throw new IOException("File not exists");
           if (file.length() == 0)
               throw new IOException("File Empty");
           ArrayList<String> data = FileHandler.readData(file);

           for (int i = 0; i < data.size() ; i++) {
               String [] values = data.get(i).split(",",2);
               if (values[0].equals(SSnn + ""))
                   data.remove(i);
           }
           FileHandler.writetoFile(file,data);
       }
       catch (Exception X){
           System.out.println(X.getMessage());
           return false;
       }
       return  true;
   }  // delete employee data

    public boolean deleteEmployee(Employee E){

        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Employees.txt");
            if (!file.exists())
                throw new IOException("File not exists");
            if (file.length() == 0)
                throw new IOException("File Empty");
            ArrayList<String> data = FileHandler.readData(file);

            for (int i = 0; i < data.size() ; i++) {
                String [] values = data.get(i).split(",",2);
                if (values[0].equals(E.getSSnn() + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return  true;
    }  // delete employee data



    public boolean addRoom(Room room){
       try {
           File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Rooms.txt");
           if (!file.exists())
               throw new IOException("File not Exists");
           FileWriter fw = new FileWriter(file,true);
           PrintWriter pw = new PrintWriter(fw);
           pw.print(room.getNo() + ", ");
           pw.print(room.isAvaliable() + ", ");
           pw.print(room.getPrice() + ", ");
           for (int i = 0; i < room.getServices().length ; i++) {
               pw.print(room.getServices()[i].getName() + ", ");
           }
           pw.println();
           pw.flush();
           pw.close();
       }
       catch (Exception X){
           System.out.println(X.getMessage());
           return false;
       }
       return true;
    }

    public boolean deleteRoom(Room room){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Rooms.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);

            for (int i = 0; i <data.size() ; i++) {
                String [] values = data.get(i).split(",",2);
                if (values[0].equals(room.getNo() + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }
    public boolean deleteRoom(int SSnn){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Rooms.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);

            for (int i = 0; i <data.size() ; i++) {
                String [] values = data.get(i).split(",",2);
                if (values[0].equals(SSnn + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }



    public boolean addGuest(Guest g){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Guest.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            FileWriter fw = new FileWriter(file,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(g.getSSnn() + ", ");
            pw.print(g.getName() + ", ");
            pw.print(g.getEmail() + ", ");
            pw.print(g.getPhone()+ ", ");
            pw.println(g.getAddress());
            pw.flush();
            pw.close();
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }

    public  boolean deleteGuest(Guest g){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Guest.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);
            for (int i = 0; i <data.size() ; i++) {
                String[] values = data.get(i).split(",",2);
                if (values[0].equals(g.getSSnn() + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X) {
            System.out.println(X.getMessage());
            return false;
        }
       return true;
    }

    public  boolean deleteGuest(int SSnn){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Guest.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);
            for (int i = 0; i <data.size() ; i++) {
                String[] values = data.get(i).split(",",2);
                if (values[0].equals(SSnn + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X) {
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }

    public boolean addService(Service s){
       try {
           File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Services.txt");
           if (!file.exists())
               throw new IOException("File not Exists");
           FileWriter fw = new FileWriter(file,true);
           PrintWriter pw = new PrintWriter(fw);
           pw.print(s.getId() + ", ");
           pw.print(s.getName() + ", ");
           pw.print(s.getStatus() + ", ");
           pw.println(s.getPrice());
           pw.flush();
           pw.close();
       }
       catch (Exception X){
           System.out.println(X.getMessage());
           return false;
       }
        return true;
    }

    public boolean deleteService(Service s){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Services.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);
            for (int i = 0; i < data.size(); i++) {
                String [] values = data.get(i).split(",",2);
                if (values[0].equals(s.getId() + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }

    public boolean deleteService(int SSnn){
        try {
            File file = new File("C:\\Users\\user\\Documents\\Hotel-Reservation-Management-System\\TXT files\\Services.txt");
            if (!file.exists())
                throw new IOException("File not Exists");
            ArrayList<String> data = FileHandler.readData(file);
            for (int i = 0; i < data.size(); i++) {
                String [] values = data.get(i).split(",",2);
                if (values[0].equals(SSnn + ""))
                    data.remove(i);
            }
            FileHandler.writetoFile(file,data);
        }
        catch (Exception X){
            System.out.println(X.getMessage());
            return false;
        }
        return true;
    }

    public boolean updateData(int SSnn,Object p){
       if (p instanceof Employee){
           deleteEmployee(SSnn);
           addEmployee((Employee) p);
       } else if (p instanceof Guest) {
           deleteGuest(SSnn);
           addGuest((Guest) p);
       }
       else if (p instanceof Room) {
           deleteRoom(SSnn);
           addRoom((Room) p);
       }
       else if (p instanceof Service) {
           deleteService(SSnn);
           addService((Service) p);
       }
        return true;
    }


    public void showData(File f){
        ArrayList<String> data = FileHandler.readData(f);
        if (!data.isEmpty())
            System.out.println(data.toString());
    } // show data from a file

    public void showData(String str){
        ArrayList<String> data = FileHandler.readData(str);
        if (!data.isEmpty())
            for (int i = 0; i <data.size() ; i++)
                System.out.println(data.get(i).toString());
    } // overlading function
}

