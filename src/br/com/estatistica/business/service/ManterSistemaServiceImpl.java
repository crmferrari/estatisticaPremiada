package br.com.estatistica.business.service;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estatistica.business.IManterSistemaService;
import br.com.estatistica.common.entity.Sistema;
import br.com.estatistica.common.exception.ApplicationException;
import br.com.estatistica.persistence.ICrudDAO;

public class ManterSistemaServiceImpl implements IManterSistemaService {

	
	private ICrudDAO<Sistema, Integer> sistemaDAO;
	
	public void setSistemaDAO(ICrudDAO<Sistema, Integer> sistemaDAO) {
		this.sistemaDAO = sistemaDAO;
	}
	
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Sistema salvarSistema(Sistema sistema) throws Exception {

		try {
		
			return sistemaDAO.saveOrUpdate(sistema);
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}	
	}

	@Transactional(readOnly = true)
	public List<Sistema> listAll() throws Exception {
		
		try {
			
			return sistemaDAO.listAll();
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}	
}