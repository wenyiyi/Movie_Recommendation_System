package com.base;

import java.util.List;

public interface DaoSupport<T>{

	/**
	 * 保存实体
	 * @param entity
	 */
	void save(T entity);

	/**
	 * 删除实体
	 * @param id
	 */
	void delete(Long id);

	/**
	 * 更新实体
	 * @param entity
	 */
	void update(T entity);

	/**
	 * 按id查询
	 * @param id
	 */
	
	T getById(Long id);
	/**
	 * 按name查询
	 * @param id
	 */
	T getByName(String name);

	/**
	 * 按name或简码查询
	 * @param name
	 */
	List<T> getByNameOrPy(String name);
	
	/**
	 * 按id查询
	 * @param ids
	 */
	List<T> getByIds(Long[] ids);

	/**
	 * 查询所有
	 */
	List<T> findAll();
	
	/**
	 * 获取记录的总数
	 */
	public int getTotals();
}
