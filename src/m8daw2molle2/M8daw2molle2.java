package m8daw2molle2;
/**
* @author X (on X és el teu nom d'usuari Github)
*/
import java.io.*;
public class M8daw2molle2 {
/**
* @param args the command line arguments
     * @throws java.io.IOException
*/
public static void main(String[] args) throws IOException {
File f = new File("fitxer.html");
try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
bw.write("<html>");bw.newLine();
bw.write(" <head>");bw.newLine();
bw.write(" <title>");bw.newLine();
bw.write(" Nova p&agrave;gina web");bw.newLine();
bw.write(" </title>");bw.newLine();
bw.write(" </head>");bw.newLine();
bw.write(" <body>");bw.newLine();
bw.write(" Nova p&agrave;gina web");bw.newLine();
bw.write(" </body>");bw.newLine();
bw.write("</html>");bw.newLine();
bw.close();
}
}
}

