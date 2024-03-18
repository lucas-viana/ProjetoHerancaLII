/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

/**
 *
 * @author lucas
 */
public class Medico extends Pessoa {
    private int id;
    
    public Medico(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        this.id = Pessoa.id;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
