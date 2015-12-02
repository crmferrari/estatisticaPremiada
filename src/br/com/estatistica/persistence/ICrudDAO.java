package br.com.estatistica.persistence;

import java.io.Serializable;
import java.util.List;

public interface ICrudDAO<T extends Serializable, PK extends Serializable> {
	Class<T> getEntityClass();
	T save(final T object)throws Exception;
	T saveOrUpdate(final T object)throws Exception;
	T update(final T object)throws Exception;
	void delete(final T object)throws Exception;
	T getByPk(final PK pk)throws Exception;
	List<T> listAll()throws Exception;
	T findByName(String propertyName, Object value);	
	T getUniqueBySQLString(String sql) throws Exception;
	List<T> listBySQLString(String sql) throws Exception;
	void getExcuteProc (String sql) throws Exception;
	List<T> listByCriterio(String nomeCampo, String valor) throws Exception;
}