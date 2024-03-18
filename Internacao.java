/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucasvianadasilva12.pkg03.pkg2024;

/**
 *
 * @author lucas
 */
public class Internacao {
    private static int id=0;
    private int idInternacao;
    private String sintomas;
    private double valorDia;
    private int qtdDias;
    private Medico medico;
    private Paciente paciente;
    private Enfermeiro enfermeiro;

    public Internacao(String sintomas, double valorDia, int qtdDias, Medico medico, Paciente paciente, Enfermeiro enfermeiro) {
        this.sintomas = sintomas;
        this.valorDia = valorDia;
        this.qtdDias = qtdDias;
        this.medico = medico;
        this.paciente = paciente;
        this.enfermeiro = enfermeiro;
    }
    
    public Internacao(){
        this.idInternacao = id;
        id++;
    }


    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Enfermeiro getEmfermeiro() {
        return enfermeiro;
    }

    public void setEmfermeiro(Enfermeiro emfermeiro) {
        this.enfermeiro = emfermeiro;
    }

    public int getIdInternacao() {
        return idInternacao;
    }
    
    @Override
    public String toString(){
        return "|--DETALHES DA INTERNAÇÃO--|ID: "+this.idInternacao+"|\t\n"+
               "|PACIENTE : "+paciente.getNome()+"| ID:"+paciente.getId()+"|\t\n"+
               "|MEDICO : "+medico.getNome()+"| ID:"+medico.getId()+"|\t\n"+"|\t\n"+
               "|ENFERMEIRO : "+enfermeiro.getNome()+"| ID:"+enfermeiro.getId()+"|\t\n"+
               "|SINTOMAS : "+this.sintomas+
               "|PREÇO DA DIARIA: "+this.valorDia+"|"+
               "|PREÇO DA DIARIA: "+this.qtdDias+"|"+
               "|PREÇO DA INTERNACAO: "+String.format("%.2f",(this.valorDia*this.qtdDias))+"|";
    }
    
}
