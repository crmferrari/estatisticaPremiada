package br.com.estatistica.persistence.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import br.com.estatistica.persistence.ICrudDAO;

public class CrudDAO<T extends Serializable,PK extends Serializable> extends HibernateDaoSupport implements ICrudDAO<T, PK>{

	private Class<T> entityClass;
	
	public Class<T> getEntityClass() {
    	return this.entityClass;
    }
	
	public CrudDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
	
	public T save(T object) throws Exception {
		
		try {
			
			this.getSessionFactory().getCurrentSession().save(object);
			
			return object;
		}catch(Exception e){
            throw new Exception("CrudDAO.save()",e);
        }
    }
	
	public T update(T object) throws Exception {
		try {
			this.getSessionFactory().getCurrentSession().update(object);
			return object;
     	}catch(Exception e){
            throw new Exception("CrudDAO.update()",e);
        }
    }
	
	public T saveOrUpdate(T object) throws Exception {
		try {
        	this.getSessionFactory().getCurrentSession().saveOrUpdate(object);
            return object;
		}catch(Exception e){
            throw new Exception("CrudDAO.saveOrUpdate()",e);
        }
    }
	
	public void delete(T object) throws Exception {
		try {
			this.getSessionFactory().getCurrentSession().delete(object);
       }catch(Exception e){
            throw new Exception("CrudDAO.delete()",e);
       }
    }

	@SuppressWarnings("unchecked")
	public T getByPk(PK primaryKey) throws Exception {
		try {
 			return (T) this.getSessionFactory().getCurrentSession().get(this.entityClass, primaryKey);         	
 		}catch(Exception e){         	
             throw new Exception("CrudDAO.getByPk()",e);
        }         
    }
	
	@SuppressWarnings("unchecked")
	public List<T> listAll() throws Exception {
	  try {
	 		Criteria c = this.getSessionFactory().getCurrentSession().createCriteria(this.entityClass);
	        return c.list();         	
	 	}catch(Exception e){         	
	          throw new Exception("CrudDAO.listAll()",e);
	    }
	 }
	
	@SuppressWarnings("unchecked")
	public List<T> listByCriterio(String nomeCampo, String valor) throws Exception {
	  try {
	 		Criteria c = this.getSessionFactory().getCurrentSession().createCriteria(this.entityClass);
	 		c.add(Restrictions.eq(nomeCampo, valor)).list();
	 		
	 		return c.list();
	 		
	 	}catch(Exception e){         	
	          throw new Exception("CrudDAO.listAll()",e);
	    }
	 }
	
	@SuppressWarnings("unchecked")
	public T findByName(String propertyName, Object value) {
		return (T) getCriteria(this.entityClass)
				.add(Restrictions.eq(propertyName, value)).list().get(0);
	}

	
	protected Criteria getCriteria(Class<T> persistentClass) {
		
		Criteria criteria = this.getSessionFactory().getCurrentSession().createCriteria(
				persistentClass);
		
		return criteria;
	}
	
	
	@SuppressWarnings({ "unchecked"})
	public T getByCriterio(String nomeAtributo, String criterio) throws Exception {
	  
		try {        
			
			Criteria c = this.getSessionFactory().getCurrentSession().createCriteria(this.entityClass);
	 		c.add(Restrictions.eq(nomeAtributo, criterio));	  
	 		
	 		return (T) c.uniqueResult();         	
	 	}catch(Exception e){         	
	          throw new Exception("CrudDAO.getListByCriterio()",e);
	    }
		
	}
	
	@SuppressWarnings({ "unchecked"})
	public List<T> listBySQLString (String sql) throws Exception {
			
		try {
			// CRIA ACESSO VIA HIBERNATE SQLQuery
			SQLQuery consulta = this.getSessionFactory().getCurrentSession().createSQLQuery(sql);
			consulta.addEntity(this.entityClass);
			return consulta.list();
			
		}catch(Exception e){         	
	          throw new Exception("CrudDAO.listBySQLString()",e);
	    }
	}
	
	@SuppressWarnings({ "unchecked"})
	public T getUniqueBySQLString (String sql) throws Exception {
			
		try {
			// CRIA ACESSO VIA HIBERNATE SQLQuery
			SQLQuery consulta = this.getSessionFactory().getCurrentSession().createSQLQuery(sql);
			consulta.addEntity(this.entityClass);
			
			return (T) consulta.uniqueResult();
			
		}catch(Exception e){         	
	          throw new Exception("CrudDAO.getUniqueBySQLString()",e);
	    }
	}
	
	@SuppressWarnings({ "unchecked"})
	public void getExcuteProc (String sql) throws Exception {
			
		try {
			// CRIA ACESSO VIA HIBERNATE SQLQuery
			SQLQuery query = this.getSessionFactory().getCurrentSession().createSQLQuery(sql);
			query.addEntity(this.entityClass);
			
			query.executeUpdate();
			
		}catch(Exception e){         	
	          throw new Exception("CrudDAO.getExcuteProc()",e);
	    }
	}

}