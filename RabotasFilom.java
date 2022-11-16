
package rabotasfilom;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;


public class RabotasFilom {

   
    public static void main(String[] args) {
       
        File file = new File("test.txt");
        try {
            file.createNewFile();
    }   catch (IOException ex){
            System.out.println(ex.getMessage());
        
    }
        File dir = new File(".");
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
