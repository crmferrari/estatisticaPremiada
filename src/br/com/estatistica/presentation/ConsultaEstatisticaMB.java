package br.com.estatistica.presentation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	private String dt1;
	private String dt2;
	private Date dt_aux_1; //auxiliar para converter Data em String (primefaces)
	private Date dt_aux_2;
	
	
		
	public Date getDt_aux_1() {
		return dt_aux_1;
	}

	public void setDt_aux_1(Date dt_aux_1) {
		this.dt_aux_1 = dt_aux_1;
	}

	public Date getDt_aux_2() {
		return dt_aux_2;
	}

	public void setDt_aux_2(Date dt_aux_2) {
		this.dt_aux_2 = dt_aux_2;
	
	}

	public String getDt1() {		
		return dt1;
	}

	public String getDt2() {	
		return dt2;
	}

	
	public void setDt1(String dt1) {
		this.dt1 = dt1;
	}

	public void setDt2(String dt2) {
		this.dt2 = dt2;
	}

	private BarChartModel initBarModel(String dta1, String dta2) throws Exception {
		
		int[][] qtdRep = this.consultaEstatisticaService.retornaQtdRepeticoes(dta1, dta2);
		
		BarChartModel model = new BarChartModel();
 
        ChartSeries num = new ChartSeries();
        num.setLabel("Repetições");
        
        for(int i=0 ; i < 25 ; i++){
			
        	num.set(qtdRep[0][i], qtdRep[1][i]);

        }
        
        model.addSeries(num);
         
        return model;
    }
     
	public String consultar() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		dt1 = sdf.format(dt_aux_1);
		dt2 = sdf.format(dt_aux_2);
       this.createBarModel(this.dt1, this.dt2);//this.dt1, this.dt2);
       return null;
    }
	
    private void createBarModels() throws Exception {
        createBarModel(this.dt1, this.dt2);//this.dt1, this.dt2);
    }
     
    private void createBarModel(String dta1, String dta2) throws Exception {
        barModel = initBarModel(dta1, dta2);
         
        barModel.setTitle("Pareto");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Números");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Quantidade");
        yAxis.setMin(0);
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