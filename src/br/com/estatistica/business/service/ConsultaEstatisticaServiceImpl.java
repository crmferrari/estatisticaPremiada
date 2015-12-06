package br.com.estatistica.business.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.estatistica.business.IConsultaEstatisticaService;
import br.com.estatistica.common.entity.Resultado;
import br.com.estatistica.common.exception.ApplicationException;
import br.com.estatistica.persistence.ICrudDAO;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ConsultaEstatisticaServiceImpl implements IConsultaEstatisticaService {

	
	private ICrudDAO<Resultado, Integer> resultadoDAO;
	
	public void setResultadoDAO(ICrudDAO<Resultado, Integer> resultadoDAO) {
		this.resultadoDAO = resultadoDAO;
	}	
	
	@Transactional( readOnly = true )
	public Map<Integer, Integer> retornaQtdRepeticoes () throws Exception {
		

		try{
			CONTINUAR DAQUI
	        
	        
		} 
		catch (Exception e) {
			throw new ApplicationException(e);
		}	
		return null;
	}
	
}