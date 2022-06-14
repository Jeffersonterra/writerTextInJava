import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String args[]) throws IOException {
        try {
            FileWriter writer = new FileWriter("poem.txt");

            writer.write("Roses are red \nViolets are blue \nThats what I like \nN' i like you.");
            writer.append("\n(A poem by Jeff)");
            writer.close();
        } catch (IOException e) {
            // AUTO GENERATED CATCH BLOCK
            e.printStackTrace();
        }
    }
}
