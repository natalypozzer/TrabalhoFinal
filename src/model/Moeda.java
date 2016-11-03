package model;

import java.util.Date;

public class Moeda {
    
    //Atributos----------------------------------------------------------------------------------------------------
    private String Nome;
    private Date Data;
    private double ValorCompra;
    private double ValorVenda;

    //Métodos Gets e Sets-----------------------------------------------------------------------------------------
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }
    
    
}
