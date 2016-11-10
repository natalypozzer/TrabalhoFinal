/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Arquivo {
    private List<Moeda> listamoedas;
    private String localarquivo;

    public String getLocalarquivo() {
        return localarquivo;
    }

    public void setLocalarquivo(String localarquivo) {
        this.localarquivo = localarquivo;
        this.salvarTodasMoedas();
    }
    public void salvarTodasMoedas(){
        List moedas=new ArrayList<Moeda>();
        BufferedReader br =null; 
        try {
            br=new BufferedReader(new FileReader(localarquivo));
            String line = "";
                while ((line = br.readLine()) != null) {
                    String[] row = line.split(";");
                    Moeda moeda=new Moeda();
                    moeda.setData(row[0]);
                    moeda.setNome(row[3]);
                    moeda.setPrecocompra(Double.valueOf(row[4].replaceAll(",", ".")));
                    moeda.setPrecovenda(Double.valueOf(row[5].replaceAll(",", ".")));
                    moedas.add(moeda);
                //System.out.println(moeda.DatatoString()+"-"+moeda.getNome()+"-"+moeda.getPrecocompra()+"-"+moeda.getPrecovenda());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        this.listamoedas=moedas;
  }
  
  public List<Moeda> listarTodasMoedas(){
        return this.listamoedas;
        }
  
  public List<Moeda> listarFiltro(Date datainicial,Date datafinal){
        List modmoedas=new ArrayList<Moeda>();
        for(int i=0;i<listamoedas.size();i++){
            int com_datainicial=datainicial.compareTo(listamoedas.get(i).getData());
            int com_datafinal=datafinal.compareTo(listamoedas.get(i).getData());
            if(com_datainicial<=0&&com_datafinal>=0){
                modmoedas.add(listamoedas.get(i));
            }
            
        }
        return modmoedas;

}}
  
     



     

        

