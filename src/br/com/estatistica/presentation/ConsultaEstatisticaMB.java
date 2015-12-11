package br.com.estatistica.presentation;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.estatistica.business.IConsultaEstatisticaService;
import br.com.estatistica.common.entity.Resultado;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean(eager = true)
@RequestScoped
public class ConsultaEstatisticaMB {
	
	private BarChartModel barModel;
	private IConsultaEstatisticaService consultaEstatisticaService;
	
	
	private BarChartModel initBarModel() throws Exception {
        
		int[][] qtdRep = this.consultaEstatisticaService.retornaQtdRepeticoes();
		
		BarChartModel model = new BarChartModel();
 
        ChartSeries num = new ChartSeries();
        num.setLabel("Repetições");
        
        for(int i=0 ; i < 25 ; i++){
			
        	num.set(qtdRep[0][i], qtdRep[1][i]);

        }
        
        model.addSeries(num);
         
        return model;
    }
     
    private void createBarModels() throws Exception {
        createBarModel();
    }
     
    private void createBarModel() throws Exception {
        barModel = initBarModel();
         
        barModel.setTitle("Pareto");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Números");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Quantidade");
        yAxis.setMin(700);
        yAxis.setMax(850);
    }
     
	public BarChartModel getBarModel() throws Exception {
		createBarModels();
		return barModel;
    }
	
	public void setConsultaEstatisticaService(
			IConsultaEstatisticaService consultaEstatisticaService) {
		this.consultaEstatisticaService = consultaEstatisticaService;
	}
}