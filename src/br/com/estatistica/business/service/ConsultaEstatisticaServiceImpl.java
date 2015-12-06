package br.com.estatistica.business.service;

import org.springframework.transaction.annotation.Transactional;
import br.com.estatistica.business.IConsultaEstatisticaService;
import br.com.estatistica.common.entity.Resultado;
import br.com.estatistica.common.exception.ApplicationException;
import br.com.estatistica.util.Utilidades;
import br.com.estatistica.persistence.ICrudDAO;
import java.util.List;
import java.util.Map;

public class ConsultaEstatisticaServiceImpl implements IConsultaEstatisticaService {

	
	private ICrudDAO<Resultado, Integer> resultadoDAO;
	
	public void setResultadoDAO(ICrudDAO<Resultado, Integer> resultadoDAO) {
		this.resultadoDAO = resultadoDAO;
	}	
	
	@Transactional( readOnly = true )
	public Map<Integer, Integer> retornaQtdRepeticoes () throws Exception {
		
		try{
			
			List<Resultado> listaResultados = this.resultadoDAO.listAll();
	        
			int size = 0;
			int[] vetorQtd = new int[listaResultados.size() * 15];
			
			for(int i = 0; i < listaResultados.size(); i++){  
				
				vetorQtd[size] =  listaResultados.get(i).getBola1();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola2();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola3();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola4();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola5();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola6();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola7();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola8();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola9();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola10();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola12();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola12();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola13();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola14();				
				size++;
				vetorQtd[size] =  listaResultados.get(i).getBola15();				
				size++;
				  
			} 
		
			Utilidades qtdRepeticoes = new Utilidades();
			return qtdRepeticoes.retornaQtdRepeticoes(vetorQtd);
			
FAZER INTRERFACE PARA MOSTRAR GRAFICO DE PARETO    CONTINUAR DAQUI			
			
		} 
		catch (Exception e) {
			throw new ApplicationException(e);
		}	
		
	}
	
}