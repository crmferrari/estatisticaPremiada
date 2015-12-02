package br.com.estatistica.business.service;

import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estatistica.business.IManterPerfilService;
import br.com.estatistica.business.query.ConsultasSQL;
import br.com.estatistica.common.entity.Perfil;
import br.com.estatistica.common.entity.Sistema;
import br.com.estatistica.common.exception.ApplicationException;
import br.com.estatistica.persistence.ICrudDAO;

public class ManterPerfilServiceImpl implements IManterPerfilService {

	
	private ICrudDAO<Perfil, Integer> perfilDAO;
	private ICrudDAO<Sistema, Integer> sistemaDAO;
	
	public void setPerfilDAO(ICrudDAO<Perfil, Integer> perfilDAO) {
		this.perfilDAO = perfilDAO;
	}	
	
	public void setSistemaDAO(ICrudDAO<Sistema, Integer> sistemaDAO) {
		this.sistemaDAO = sistemaDAO;
	}	
	
	@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
	public Perfil salvarPerfil(Perfil perfil) throws Exception {

		try {
			
			
			return perfilDAO.saveOrUpdate(perfil);
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}	
	}
	
	@Transactional(readOnly = true)
	public List<Sistema> listSistemas() throws Exception {
		
		try {
			
			return sistemaDAO.listAll();
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}	
	
	@Transactional(readOnly = true)
	public List<Perfil> listaPerfis() throws Exception {
		
		try {
			
			return perfilDAO.listAll();
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}

	@Transactional(readOnly = true)
	public List<Perfil> listaPerfisSistema(Integer idSistema) throws Exception {
		
		try {
			
			ConsultasSQL query = new ConsultasSQL();
			return perfilDAO.listBySQLString(query.sqlConsultaPefisSistema(idSistema));
		
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}
}