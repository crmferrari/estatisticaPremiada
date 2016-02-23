package br.com.estatistica.business.query;

public class ConsultasSQL {
	
	public String sqlConsultaResultadosByIntervalo(String data1, String data2){
		
		String sql = "select * from resultado where resu_dt_sorteio between to_date('" + data1 + "', 'DD/MM/YYYY') and to_date('" + data2 + "', 'DD/MM/YYYY')";
		
		return sql;
	}
	
}