package com.tecsup.spingjdbc.dao;

import java.util.List;

public interface GenericDao<T> {
	public List<T> list();
	public T get(long t);
	public void save (T t);
	public void update (T t);
	public void delete(long t);
}
