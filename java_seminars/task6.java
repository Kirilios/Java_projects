package java_seminars;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Записать в файл следующие данные:
//
//        Name Surname Age
//        Kate Smith 20
//        Paul Green 25
//        Mike Black 23
public class task6 {
    public static void main(String[] args) {
        File file = new File("task6.txt");
        try (FileWriter fw = new FileWriter(file)) {
            String data = "Name Surname Age\n Kate Smith 20\n Paul Green 25\n Mike Black 23";
            fw.write(data);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
