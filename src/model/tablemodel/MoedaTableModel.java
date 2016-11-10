package model.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Moeda;

public class MoedaTableModel extends AbstractTableModel{
    
    private List<Moeda> moedas;
    
    //Construtores-------------------------------------------------------------------------------------------------
    public MoedaTableModel(){
        moedas = new ArrayList<Moeda>();
    }
    
    public MoedaTableModel(List<Moeda> lista){
        this();
        moedas.addAll(lista);
    }
    
    //Sobrescrevendo Métodos------------------------------------------------------------------------------------
    @Override
    public int getRowCount(){
        return moedas.size();
    }
    
    @Override
    public int getColumnCount(){
        return 4;
    } 
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Moeda";
            case 1: return "Data";
            case 2: return "Valor Compra";
            case 3: return "Valor Venda";
            default : return "NoName";
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Moeda rs = moedas.get(rowIndex);
        
        switch(columnIndex){
            case 0: return rs.getNome();
            case 1: return rs.DatatoString();
            case 2: return rs.getPrecocompra();
            case 3: return rs.getPrecovenda();
            default : return "";
        }
    }
    
    //Selecionar Moeda-------------------------------------------------------------------------------------------
    public Moeda getMoeda(int row){
        //testa se nao esta selecionada uma linha acima
        if(row >= moedas.size()){
            return null;
        }
        
        return moedas.get(row);
    }
    
    //Selecionar Lista----------------------------------------------------------------------------------------------
    public List<Moeda> getLista(){
        return moedas;
    }
}
