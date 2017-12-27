package com.liu.project.basis.dao;

import java.io.Serializable;

/**
 * @desc MybatisDao
 * @author Liuweian
 * @createTime 2017年12月22日 上午11:32:25
 * @version 1.0
 */
public interface MybatisDao<entity extends Serializable, id extends Serializable> 
				extends BasisDao<entity, id>{
	
	/**
	 * @desc 查询总条数
	 * @author Liuweian
	 * @createTime 2017年12月18日 上午10:07:02
	 * @return
	 * @throws DataAccessException
	 */
	public int getCount() throws Exception;
					
}
