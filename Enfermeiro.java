/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

/**
 *
 * @author lucas
 */
public class Enfermeiro extends Pessoa {
    private int id;
    public Enfermeiro(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        this.id = Pessoa.id;
    }
    

    @Override
    public int getId() {
        return this.id;
    }
    
    public String toString(){
        return "Teste";
    }
}
