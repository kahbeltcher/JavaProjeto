package computador;

/**
 *
 * @author kah
 */
public class AppComputador {
        public static void main(String[] args) {
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador(1000,8,"windows","intel i7","dell");
        Computador pc4 = new Computador(500,6,"Linux","Celeron 3","Lenovo");
           
        //Entrada de dados        
        System.out.println("PC1");
        pc1.entradaDados();
        System.out.println("----------------------------");
        System.out.println("PC2");
        pc2.entradaDados();
        System.out.println("----------------------------");
        
        //Saida de dados
        System.out.println("PC1:");
        pc1.imprimir();
        System.out.println("----------------------------");
        System.out.println("PC2:");
        pc2.imprimir();
        
        System.out.println("----------------------------");
         System.out.println("PC3:");
        pc3.imprimir();
        System.out.println("----------------------------");
        System.out.println("PC4:");
        pc4.imprimir();
        System.out.println("----------------------------");
    }
}