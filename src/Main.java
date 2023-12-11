// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String []argc)
  {
      Receptionist admin = new Receptionist();

     Guest a = new Guest("ab","dfsf","2225","sffs");
     Guest b = new Guest("ahmed","dfsf","010","sfsfs");
     Guest c = new Guest("omar","dfsf","011","sfhhh");
     Service s = new Service("pool",true,100.3);
     Service ss = new Service("Spa",true,256.3);
     Service sss = new Service("Sauna",true,155.8);
     admin.deleteService(sss);


  }

}