package practicals.file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OneToAnother {
    public static void main(String[] args) {
        String FILE_PATH = "D:\\text_file1.txt";
        String FILE_PATH_2 = "D:\\text_file2.txt";

        try{
            FileInputStream inputFile = new FileInputStream(FILE_PATH);
            FileOutputStream outputFile = new FileOutputStream(FILE_PATH_2);

            byte[] bytes = inputFile.readAllBytes();
            outputFile.write(bytes);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
