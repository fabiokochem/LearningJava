import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("ababdaduaduaubuuuu");
        bw.newLine();
        bw.write("fafhafhahfahafh");

        bw.close();
    }
}
