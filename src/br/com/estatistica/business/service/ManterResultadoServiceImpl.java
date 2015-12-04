package br.com.estatistica.business.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//import br.com.estatistica.business.IManterResultadosService;
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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ManterResultadoServiceImpl {//implements IManterResultadosService {

	
	private ICrudDAO<Resultado, Integer> resultadoDAO;
	
	public void setResultadoDAO(ICrudDAO<Resultado, Integer> resultadoDAO) {
		this.resultadoDAO = resultadoDAO;
	}
	
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public String importarResultados() throws Exception {
		
		Integer id;	
    	String dtSorteio;
		Integer bola1;
		Integer bola2;
		Integer bola3;
		Integer bola4;
		Integer bola5;
		Integer bola6;
		Integer bola7;
		Integer bola8;
		Integer bola9;
		Integer bola10;
		Integer bola11;
		Integer bola12;
		Integer bola13;
		Integer bola14;
		Integer bola15;
		Integer qtdGanhadores15;
		Integer qtdGanhadores14;
		Integer qtdGanhadores13;
		Integer qtdGanhadores12;
		Integer qtdGanhadores11;
		String localSorteio;
		
		try {
			
			FileInputStream input_document = new FileInputStream(new File("C:\\resultados.xls")); //Read XLS document - Office 97 -2003 format     
	        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document); //Read the Excel Workbook in a instance object    
	        HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0); //This will read the sheet for us into another object
	        Iterator<Row> rowIterator = my_worksheet.iterator(); // Create iterator object
	        while(rowIterator.hasNext()) {
	                Row row = rowIterator.next(); //Read Rows from Excel document       
	                Iterator<Cell> cellIterator = row.cellIterator();//Read every column for every row that is READ
                    while(cellIterator.hasNext()) {
                            Cell cell = cellIterator.next(); //Fetch CELL
                            
                          
                            
                            
                            
                            
                            
                            switch(cell.getCellType()) { //Identify CELL type
                            case Cell.CELL_TYPE_NUMERIC:
                                    System.out.print(cell.getNumericCellValue() + ";"); //print numeric value
                                    
                                    break;
                            case Cell.CELL_TYPE_STRING:
                                    System.out.print(cell.getStringCellValue() + ";"); //print string value
                                    break;
                            }
                    }
                    System.out.println(""); // To iterate over to the next row
	        }
	        input_document.close(); //Close the XLS file opened for printing
			
			
	      
	        
	        
			
			return "Sucesso";
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}	
	}	
}