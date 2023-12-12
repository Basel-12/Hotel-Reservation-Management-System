import java.io.*;
import java.util.*;
public class FileHandler {
    private File f;
    FileHandler() {}
    FileHandler(String s)
    {
        f = new File(s);
    }

    public void setFile(File f) {
        this.f = f;
    }
    public void setPath(String path){
        f = new File(path);
    }

    public static ArrayList<String> readData(File f) {
        ArrayList<String> data = new ArrayList<>();
        try {
            File file = f;
            if (!file.exists())
                throw new IOException("File not exists");
            Scanner read = new Scanner(file);
            String line;
            while (read.hasNextLine()) {
                line = read.nextLine();
                data.add(line);
            }
            read.close();
        } catch (Exception X) {
            System.out.println(X.getMessage());
        }
        return data;
    }   // readdata from file
    public static ArrayList<String> readData(String str) {
        ArrayList<String> data = new ArrayList<>();
        try {
            File file = new File(str);
            if (!file.exists())
                throw new IOException("File not exists");
            Scanner read = new Scanner(file);
            String line;
            while (read.hasNextLine()) {
                line = read.nextLine();
                data.add(line);
            }
            read.close();
        } catch (Exception X) {
            System.out.println(X.getMessage());
        }
        return data;
    }

    public static void writetoFile(File f,ArrayList<String> ar) // write data to a file
    {
        try {
            File file = f;
            if (!file.exists())
                throw new IOException("File not exists");
            PrintWriter pw = new PrintWriter(file);
            for(String c : ar)
                pw.println(c);
            pw.flush();
            pw.close();
        }
        catch (Exception X){
            System.out.println(X.getMessage());
        }
    }

    public   static void writetoFile(String str,ArrayList<String> ar)
    {
        try {
            File file = new File(str);
            if (!file.exists())
                throw new IOException("File not exists");
            PrintWriter pw = new PrintWriter(file);
            for(String c : ar)
                pw.println(c);
            pw.close();
        }
        catch (Exception X){
            System.out.println(X.getMessage());
        }
    }

    public static int nousers(File f){
        ArrayList<String> data = readData(f);
        return data.size();
    }
    public static int nousers(String str){
        ArrayList<String> data = readData(str);
        return data.size();
    }
}