package br.com.estatistica.business.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estatistica.business.IManterResultadoService;
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

public class ManterResultadoServiceImpl implements IManterResultadoService {

	
	private ICrudDAO<Resultado, Integer> resultadoDAO;
	
	public void setResultadoDAO(ICrudDAO<Resultado, Integer> resultadoDAO) {
		this.resultadoDAO = resultadoDAO;
	}	
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Resultado importarResultados() throws Exception {
		
		Integer id;	
    	Date dtSorteio;
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
		try{
			FileInputStream input_document = new FileInputStream(new File("C:\\resultados.xls")); //Read XLS document - Office 97 -2003 format     
	        HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document); //Read the Excel Workbook in a instance object    
	        HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0); //This will read the sheet for us into another object
	        Iterator<Row> rowIterator = my_worksheet.iterator(); // Create iterator object
	        
	        while(rowIterator.hasNext()) {
                Row row = rowIterator.next(); //Read Rows from Excel document       
                Iterator<Cell> cellIterator = row.cellIterator();//Read every column for every row that is READ
                Cell cell = cellIterator.next(); //Fetch CELL
                id = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                dtSorteio = DateUtil.getJavaDate(cell.getNumericCellValue());
                cell = cellIterator.next(); //Fetch CELL
                bola1 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola2 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola3 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola4 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola5 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola6 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola7 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola8 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola9 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola10 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola11 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola12 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola13 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola14 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                bola15 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                qtdGanhadores15 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
                qtdGanhadores14 = (int) cell.getNumericCellValue();
                cell = cellIterator.next(); //Fetch CELL
    			qtdGanhadores13 = (int) cell.getNumericCellValue();
    			cell = cellIterator.next(); //Fetch CELL
    			qtdGanhadores12 = (int) cell.getNumericCellValue();
    			cell = cellIterator.next(); //Fetch CELL
    			qtdGanhadores11 = (int) cell.getNumericCellValue();
    			
    			Resultado resultado = new Resultado();
    			resultado.setId(id);
    			resultado.setDtSorteio(dtSorteio);
    			resultado.setBola1(bola1);
    			resultado.setBola2(bola2);
    			resultado.setBola3(bola3);
    			resultado.setBola4(bola4);
    			resultado.setBola5(bola5);
    			resultado.setBola6(bola6);
    			resultado.setBola7(bola7);
    			resultado.setBola8(bola8);
    			resultado.setBola9(bola9);
    			resultado.setBola10(bola10);
    			resultado.setBola11(bola11);
    			resultado.setBola12(bola12);
    			resultado.setBola13(bola13);
    			resultado.setBola14(bola14);
    			resultado.setBola15(bola15);
    			resultado.setQtdGanhadores11(qtdGanhadores11);
    			resultado.setQtdGanhadores12(qtdGanhadores12);
    			resultado.setQtdGanhadores13(qtdGanhadores13);
    			resultado.setQtdGanhadores14(qtdGanhadores14);
    			resultado.setQtdGanhadores15(qtdGanhadores15);
    			
    			this.resultadoDAO.saveOrUpdate(resultado);
                
	        }
	        input_document.close(); //Close the XLS file opened for printing
		} 
		catch (Exception e) {
			throw new ApplicationException(e);
		}	
		return null;
	}
	
}