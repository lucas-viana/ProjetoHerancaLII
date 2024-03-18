/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

import java.util.Scanner;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNum = new Scanner(System.in);
        System.out.println("Entre com o cpf para cadastrar um médico: ");
        String cpf = sc.nextLine();
        System.out.println("Entre com o nome para cadastrar um médico: ");
        String nome = sc.nextLine();
        System.out.println("Entre com o telefone para cadastrar um médico: ");
        String telefone = sc.nextLine();
        Medico medico1 = new Medico(cpf,nome,telefone);
        
        System.out.println("Entre com o cpf para cadastrar um enfermeiro: ");
        cpf = sc.nextLine();
        System.out.println("Entre com o nome para cadastrar um enfermeiro: ");
        nome = sc.nextLine();
        System.out.println("Entre com o telefone para cadastrar um enfermeiro: ");
        telefone = sc.nextLine();
        Enfermeiro enfermeiro1 = new Enfermeiro(cpf,nome,telefone);
        
        
        System.out.println("Entre com o cpf para cadastrar um paciente: ");
        cpf = sc.nextLine();
        System.out.println("Entre com o nome para cadastrar um paciente: ");
        nome = sc.nextLine();
        System.out.println("Entre com o telefone para cadastrar um paciente: ");
        telefone = sc.nextLine();
        System.out.println("Digite o endereço do paciente:");
        String endereco = sc.nextLine();
        System.out.println("Digite o numero da casa: ");
        int numCasa = scNum.nextInt();
        System.out.println("Entre com os sintomas do paciente");
        String sintomas = sc.nextLine();
        
        Paciente paciente = new Paciente(cpf,nome,telefone,sintomas,endereco,numCasa);
        
        
        
        System.out.println("Entre com o numero de dias estimados para a internação: ");
        int dias = scNum.nextInt();
        System.out.println("Entre com o valor da diária:");
        double valorDia = scNum.nextDouble();
        Internacao internacao1 = new Internacao(paciente.getSintomas(), valorDia, dias, medico1,paciente,enfermeiro1);
        
        System.out.println(internacao1);
    }

}
