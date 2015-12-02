package br.com.estatistica.persistence.hibernate;

import br.com.estatistica.common.entity.UsuarioCadAdm;
import br.com.estatistica.persistence.IUsuarioCadAdmDAO;

public class UsuarioCadAdmDAO extends CrudDAO<UsuarioCadAdm, Integer> implements IUsuarioCadAdmDAO{

	public UsuarioCadAdmDAO() {

		super(UsuarioCadAdm.class);
		
	}
}
