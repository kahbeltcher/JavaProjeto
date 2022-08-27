package computador;

import java.util.Scanner;

/**
 *
 * @author karen silva matricula:20211303170 aula: Programação orientada a
 * objeto
 */
public class Computador {
    //Instanciando scanner
    Scanner sc = new Scanner(System.in);
    //Atributos
    private int armazenamento, memoria;
    private String sistema, processador, marca;

    //Construtores
    public Computador() {
        //default
    }

    public Computador(int armazenamento, int memoria, String sistema, String processador, String marca) {
        super();
        this.armazenamento = armazenamento;
        this.memoria = memoria;
        this.sistema = sistema;
        this.processador = processador;
        this.marca = marca;
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
        armazenamento = Integer.parseInt(sc.nextLine());
        //MEMORIA
        System.out.print("Insira a quantidade de memoria do computador: ");
        memoria = Integer.parseInt(sc.nextLine());
        //SISTEMA
        System.out.print("Insira o sistema operacional do computador: ");
        sistema = sc.nextLine();
        //PROCESSADOR
        System.out.print("Insira o processador do computador: ");
        processador = sc.nextLine();
        //MARCA
        System.out.print("Insira a Marca do computador: ");
        marca = sc.nextLine();
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
