import java.io.*;
import java.util.*;
public class FileHandler {
    private File f;
    FileHandler()
    {
        this("");
    }
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
}