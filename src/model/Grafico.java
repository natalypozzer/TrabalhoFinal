/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aluno
 */
public class Grafico {
    String grafico;
    
    public void geraGrafico(List<Moeda> listamoedas){     
    DefaultCategoryDataset ds = new DefaultCategoryDataset();   
    if(listamoedas == null){
        return;
    }
    for (int i = 0; i < listamoedas.size(); i++) {
            ds.addValue(listamoedas.get(i).getPrecocompra(), "Preço de Compra", listamoedas.get(i).DatatoString());
            ds.addValue(listamoedas.get(i).getPrecovenda(), "Preço de Venda", listamoedas.get(i).DatatoString());
    
    }   
    JFreeChart grafico = ChartFactory.createLineChart("Variações da Moeda", "Dia", "Valor", ds, PlotOrientation.VERTICAL, true, true, false); 
    //XYPlot plot = grafico.getXYPlot();    
    //ValueAxis yAxis = plot.getRangeAxis();
    //yAxis.setRange(3, 3.5);
    try{
        OutputStream arquivo = new FileOutputStream("grafico.png");
        ChartUtilities.writeChartAsPNG(arquivo, grafico, 550, 400);
        arquivo.close();
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
