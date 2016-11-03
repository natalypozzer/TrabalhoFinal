/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aluno
 */
public class Grafico {
    String grafico;
    String eixoX;
    String eixoY;
    
    public void geraGrafico(){        
    DefaultCategoryDataset ds = new DefaultCategoryDataset();
    ds.addValue(40.5, "maximo", "dia 1");
    ds.addValue(38.2, "maximo", "dia 2");
    ds.addValue(37.3, "maximo", "dia 3");
    ds.addValue(31.5, "maximo", "dia 4");
    ds.addValue(35.7, "maximo", "dia 5");
    ds.addValue(42.5, "maximo", "dia 6");    
    JFreeChart grafico = ChartFactory.createLineChart("Meu Grafico", "Dia", "Valor", ds, PlotOrientation.VERTICAL, true, true, false);      
    try{
        OutputStream arquivo = new FileOutputStream("grafico.png");
        ChartUtilities.writeChartAsPNG(arquivo, grafico, 550, 400);
        arquivo.close();
        }catch(Exception e){
            System.out.println("ERRO");
        }
    }
}
