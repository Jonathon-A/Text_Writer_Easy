package text_writer_easy;

import java.io.FileOutputStream;

public class Text_Writer_Easy {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir") + "\\testout.txt");
            //Writes "A" (65 ascii for A)
            fout.write(65);
                              
            //Writes string
            String mystring = "Hi there";
            byte b[] = mystring.getBytes();
            fout.write(b);

            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
