import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("src/fichero.txt");
            br = new BufferedReader(fr);

            // Variable para guardar la línea leída
            String salida;
            salida = br.readLine();

            while (salida != null) {
                
                // Imprimir la línea por terminal
                System.out.println(salida);

                // Leer la siguiente línea y guardarla en salida
                salida = br.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {

            if (br != null) {
                br.close();

            }

        }

    }

}
