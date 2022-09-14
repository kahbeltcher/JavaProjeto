package computador;

import java.util.Scanner;

/**
 *
 * @author kah
 */
public class AppComputador extends Computador {

    public static void main(String[] args) {

        Computador pc1 = new Computador();
        Computador pc2 = new Computador();

        pc1.entradaDados();
        pc2.entradaDados();

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.print("Insira a quantidade de armazenamento do computador: ");
        int armazenamento = Integer.parseInt(sc.nextLine());        
        System.out.print("Insira a quantidade de memoria do computador: ");
        int memoria =Integer.parseInt(sc.nextLine());
        System.out.print("Insira o processador do computador: ");
        String processador = sc.nextLine();
        System.out.print("Insira o sistema operacional do computador: ");
        String sistema = sc.nextLine();
        System.out.print("Insira a Marca do computador: ");
        String marca = sc.nextLine();
        Computador pc3 = new Computador(armazenamento,memoria,sistema,processador,marca);
        System.out.println("------------------------------------");
        System.out.print("Insira a quantidade de armazenamento do computador: ");
        armazenamento = Integer.parseInt(sc.nextLine());        
        System.out.print("Insira a quantidade de memoria do computador: ");
        memoria =Integer.parseInt(sc.nextLine());
        System.out.print("Insira o processador do computador: ");
        processador = sc.nextLine();
        System.out.print("Insira o sistema operacional do computador: ");
        sistema = sc.nextLine();
        System.out.print("Insira a Marca do computador: ");
        marca = sc.nextLine();
        Computador pc4 = new Computador(armazenamento,memoria,sistema,processador,marca);
        System.out.println("------------------------------------");

        pc1.imprimir();
        pc2.imprimir();
        pc3.imprimir();
        pc4.imprimir();
    }
}
