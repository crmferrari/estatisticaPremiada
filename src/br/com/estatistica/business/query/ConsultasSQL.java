package br.com.estatistica.business.query;

public class ConsultasSQL {

	public String sqlConsultaPefisSistema(Integer idSistema){
		
		String sql = "select * from perfil where sist_cd_codigo= " + idSistema;
		
		return sql;
	}	
	
}