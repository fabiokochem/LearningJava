import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // FileOutputStream fos = new FileOutputStream("lorem2.txt");
        // OutputStreamWriter osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);

        //FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));


        bw.write("sauhuashhusauhsa");
        // fw.write(System.lineSeparator());
        bw.newLine();
        bw.write("hahahahahah");

        bw.close();
    }
}
