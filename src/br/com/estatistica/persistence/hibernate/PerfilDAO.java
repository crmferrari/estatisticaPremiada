package br.com.estatistica.persistence.hibernate;

import br.com.estatistica.common.entity.Perfil;
import br.com.estatistica.persistence.IPerfilDAO;

public class PerfilDAO extends CrudDAO<Perfil, Integer> implements IPerfilDAO{

	public PerfilDAO() {

		super(Perfil.class);
		
	}
}
