import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
        // FileOutputStream fos = new FileOutputStream("lorem2.txt");
        // OutputStreamWriter osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);

        //FileWriter fw = new FileWriter("lorem2.txt");
        // BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        PrintStream ps = new PrintStream("lorem2.txt");

        ps.print("qualquer coisa de fato");
        // fw.write(System.lineSeparator());
        ps.println();
        ps.print("aaaaaaaaaa");

        ps.close();


        PrintWriter pw = new PrintWriter("lorem2.txt");

        pw.print("qualquer coisa de fato");
        pw.println();

        pw.close();
    }
}
