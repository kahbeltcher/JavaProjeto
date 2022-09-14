package computador;

import java.util.Scanner;

/**
 *
 * @author kah
 */
public class Computador {

    public Computador(int armazenamento, int memoria, String sistema, String processador, String marca) {
          Computador.armazenamento = armazenamento;
            Computador.memoria = memoria;
            Computador.sistema = sistema ;
            Computador.processador = processador;
            Computador.marca = marca;
    }

    //Instanciando scanner
    Scanner sc = new Scanner(System.in);
    //Atributos
    public static int armazenamento, memoria;
    public static String sistema, processador, marca;

    public Computador(){
        
    }
  
    //SET 
    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //GET 
    public int getArmazenamento() {
        return armazenamento;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getSistema() {
        return sistema;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMarca() {
        return marca;
    }

    //ENTRADA DE DADOS
    public void entradaDados() {
        //ARMAZENAMENTO
        System.out.print("Insira a quantidade de armazenamento do computador: ");
        setArmazenamento(Integer.parseInt(sc.nextLine()));
        //MEMORIA
        System.out.print("Insira a quantidade de memoria do computador: ");
        setMemoria(Integer.parseInt(sc.nextLine()));
        //SISTEMA
        System.out.print("Insira o sistema operacional do computador: ");
        setSistema(sc.nextLine());
        //PROCESSADOR
        System.out.print("Insira o processador do computador: ");
        setProcessador(sc.nextLine());
        //MARCA
        System.out.print("Insira a Marca do computador: ");
        setMarca(sc.nextLine());
    }

    //SAIDA DE DADOS
    public void imprimir() {
        System.out.println(
                "\nArmazenamento: " + armazenamento + "GB"
                + "\nMemoria: " + memoria + " GB"
                + "\nSistema: " + sistema
                + "\nProcessador: " + processador
                + "\nMarca: " + marca
        );
    }
}
