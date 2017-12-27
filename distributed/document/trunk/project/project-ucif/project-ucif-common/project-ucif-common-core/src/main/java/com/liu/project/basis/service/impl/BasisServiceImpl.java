package com.liu.project.basis.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.liu.project.basis.dao.BasisDao;
import com.liu.project.basis.service.BasisService;

/**
 * @desc 基本业务操作的实现
 * @author Liuweian
 * @createTime 2017年12月20日 下午1:42:16
 * @version 1.0
 */
public abstract class BasisServiceImpl<Entity extends Serializable,D extends BasisDao<Entity, ID>, ID extends Serializable> 
				implements BasisService<Entity, ID> {

	protected abstract D getDao();
	
	public int insert(Entity en) throws Exception {
		return this.getDao().insert(en);
	}

	public int insertList(List<? extends Entity> list) throws Exception { 
		return this.getDao().insertList(list);
	}

	public int delete(ID id) throws Exception { 
		return this.getDao().delete(id);
	}

	public int deleteList(List<? extends ID> list) throws Exception { 
		return this.getDao().deleteList(list);
	}

	public int deleteAll() throws Exception { 
		return this.getDao().deleteAll();
	}

	public int deleteByParam(Map<String, Object> map) throws Exception { 
		return this.getDao().deleteByParam(map);
	}
	
	public int update(Entity en) throws Exception { 
		return this.getDao().update(en);
	}
	
	public int updateList(List<? extends Entity> list) throws Exception { 
		return this.getDao().updateList(list);
	}

	public Entity getById(ID id) throws Exception { 
		return this.getDao().getById(id);
	}

	public List<Entity> getListByParam(Map<String, Object> map) throws Exception { 
		return this.getDao().getListByParam(map);
	}

	public List<Entity> getListPage() throws Exception { 
		System.out.println("分页操作");
		return null;
	}
}
