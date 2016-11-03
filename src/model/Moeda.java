/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Moeda {
    
    private String nome;
    private Date data;
    private double precovenda;
    private double precocompra;
    public String DatatoString(){
        if (data != null){
            SimpleDateFormat formatoData = new 
                            SimpleDateFormat("dd/MM/yyyy");
            return formatoData.format(data );
        }else{
            return null;
        }}
    public void setData(String stdata){
        try {
            DateFormat formatter = new SimpleDateFormat("ddMMyyyy");
            this.data = (Date)formatter.parse(stdata);
        } catch (ParseException e) {            
             e.printStackTrace();
        }
        
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }
    
    
    
   
}

