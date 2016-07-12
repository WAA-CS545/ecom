package com.cs545.ecom.persistence;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractDAO<PK extends Serializable, T> {
	private final Class<T> persistenceClass;
	
	public AbstractDAO() {
		this.persistenceClass = (Class<T>)((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
}
