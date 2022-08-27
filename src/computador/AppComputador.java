package computador;

/**
 *
 * @author karen prazeres da silva 
 * matricula:20211303170 
 * aula: Programação orientada a objeto.
 */
public class AppComputador{

    public static void main(String[] args) {

        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();
        Computador pc4 = new Computador();
        
        pc1.imprimir();
        
        System.out.println("----------------------------");
        pc2.imprimir();
        
        System.out.println("----------------------------");
        
        pc3.entradaDados();
        
        System.out.println("----------------------------");
        
        pc3.imprimir();
        
        System.out.println("----------------------------");
        
        pc4.entradaDados();
        
        System.out.println("----------------------------");
        
        pc4.imprimir();
        System.out.println("----------------------------");
    }
}
