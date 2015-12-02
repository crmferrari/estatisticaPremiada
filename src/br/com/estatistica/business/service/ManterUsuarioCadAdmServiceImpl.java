package br.com.estatistica.business.service;

//import java.math.BigInteger;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estatistica.business.IManterUsuarioCadAdmService;
import br.com.estatistica.common.entity.UsuarioCadAdm;
import br.com.estatistica.common.exception.ApplicationException;
import br.com.estatistica.persistence.ICrudDAO;

public class ManterUsuarioCadAdmServiceImpl implements IManterUsuarioCadAdmService {

	
	private ICrudDAO<UsuarioCadAdm, BigInteger> usuarioCadAdmDAO;
	
	public void setUsuarioCadAdmDAO(ICrudDAO<UsuarioCadAdm, BigInteger> usuarioCadAdmDAO) {
		this.usuarioCadAdmDAO = usuarioCadAdmDAO;
	}
	
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public UsuarioCadAdm salvarUsuarioCadAdm(UsuarioCadAdm usua) throws Exception {

		try {
		
			return usuarioCadAdmDAO.saveOrUpdate(usua);
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}	
	}	
}