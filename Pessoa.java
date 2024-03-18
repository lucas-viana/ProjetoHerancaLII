/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

/**
 *
 * @author lucas
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private boolean disponivel=true;
    protected static int id=0;

    public Pessoa(String cpf, String nome,String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        Pessoa.id++;
    }
    
    public Pessoa(){
        Pessoa.id++;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    

    public int getId() {
        return id;
    }
}        

