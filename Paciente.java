/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

/**
 *
 * @author lucas
 */
public class Paciente extends Pessoa{
    private int id;
    private String sintomas;
    private String endereco;
    private int numCasa;

    public Paciente(String cpf, String nome, String telefone, String sintomas, String endereco, int numCasa) {
        super(cpf, nome, telefone);
        this.id = Pessoa.id;
        this.sintomas = sintomas;
        this.endereco = endereco;
        this.numCasa = numCasa;
    }
    public Paciente(Paciente paciente) {
        
    }
    public Paciente(){
        this.id = Pessoa.id;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return "Nome paciente: "+getNome()+"\n"+
               "Cpf: "+getCpf()+"\n";
    }
}
