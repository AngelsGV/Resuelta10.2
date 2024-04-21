import java.io.*;

public class Main {
    String texto = "";
    FileReader in = null;
    //se declara fuera de la estructura try-catch pera que sea accesible desde fuera
    try{
        in = new FileReader("Main.java");
        int c = in.read();
        while (c != -1){
            texto = texto + char c;
            c = in.read();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally{
            if (in != null){
                try{
                    in.close();
                }catch (IOException ex){
                    System.out.println(ex);
                }
            }
        }
        System.out.println(texto);
    }


}