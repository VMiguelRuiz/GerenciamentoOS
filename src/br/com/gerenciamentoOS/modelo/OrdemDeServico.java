package br.com.gerenciamentoOS.modelo;

import java.util.Calendar;
import java.util.Date;

public class OrdemDeServico {

    private int idOS;
    private Calendar dataOS;
    private String equipamento;
    private String defeito;
    private String servico;
    private double valor;
    private int idClienteOS;
    
    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public Calendar getDataOS() {
        return dataOS;
    }

    public void setDataOS(Calendar dataOS) {
        this.dataOS = dataOS;
    }

    

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getIdClienteOS() {
        return idClienteOS;
    }

    public void setIdClienteOS(int idClienteOS) {
        this.idClienteOS = idClienteOS;
    }

}
