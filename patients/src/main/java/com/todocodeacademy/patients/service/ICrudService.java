package com.todocodeacademy.patients.service;

import java.util.List;

public interface ICrudService<T> {

	public List<T> get();
	public void save(T t);
	public void delete(Long id);
	public T find(Long id);
	public void edit(T t);
	
}
