import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ordenador ordenador1 = new Ordenador("Acer", "Nitro N50-650", 16, 1, 999);

        System.out.println("El ordenador " + ordenador1.getMarca() + " modelo: " + ordenador1.getModelo() + " cuenta con: " + ordenador1.getRAM() + " GB de RAM, perfecto para tu proyecto de DEV" );
        
        System.out.println(ordenador1.toString());

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la marca del ordenador que quieres");
        String marcaUser = teclado.nextLine();

        ordenador1.setMarca(marcaUser);

        System.out.println(ordenador1.toString());

        teclado.close();


    }
}
