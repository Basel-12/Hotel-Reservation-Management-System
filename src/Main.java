import java.io.*;
import java.util.*;
public class Main {
  public static void main(String []argc) {
      Receptionist admin = new Receptionist();

      Guest s = new Guest("saad","fff","gg","hh");
//        admin.addGuest(s);
           admin.updateData(2,s);

  }

}