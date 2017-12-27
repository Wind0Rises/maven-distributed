package com.liu.project.basis.model;

import java.io.Serializable;

/**
 * @desc 对主键的操作的接口
 * @author Liuweian
 * @createTime 2017年12月22日 上午11:33:27
 * @version 1.0
 */
public interface BasisPrimary<PK extends Serializable> extends Serializable{

	public void setId(PK id);
	
	public PK getId();
	
}
