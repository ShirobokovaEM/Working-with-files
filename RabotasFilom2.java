
package rabotasfilom2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class RabotasFilom2 {

    
    public static void main(String[] args) throws IOException {
        
        FileWriter writer = new FileWriter("hello.txt");//создаем обект
        writer.write("Привет из Java!");//здесь записываем данные
        writer.close();//закрываем файл
        
        BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));//здесь создаем буфер на основе файла
        String str = reader.readLine();
        System.out.println(str);
        reader.close();//это указывать не обязательно
    }
    
}
