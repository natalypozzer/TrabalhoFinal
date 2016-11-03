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
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Arquivo {
    
    public List<Moeda> listarTodasMoedas(){
        List moedas=new ArrayList<Moeda>();
        BufferedReader br =null; 
        try {
            br=new BufferedReader(new FileReader("file.csv"));
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
        return moedas;
  }
  /*public List<Moeda> listarFiltro(Date datainicial,Date datafinal){
        List<Moeda> moedas=this.listarTodasMoedas();
        List modmoedas=new ArrayList<Moeda>();
        for(int i=0;i<moedas.size();i++){
            if(>moedas.get(i).getData())
                
            //    }}
        return modmoedas;
    }*/

}
  
     



     

        

