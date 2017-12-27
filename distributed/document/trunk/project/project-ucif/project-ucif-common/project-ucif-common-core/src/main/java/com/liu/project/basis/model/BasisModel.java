package com.liu.project.basis.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @desc 每个实体所必须要继承的基类，包含一些所必须的字段
 * @author Liuweian
 * @createTime 2017年12月18日 上午9:37:50
 * @version 1.0
 */
public class BasisModel<PK extends Serializable> implements BasisPrimary<PK> {

	private static final long serialVersionUID = 1L;
	
	private PK id;
	
	private Date createDate;
	
	private Date updateDate;
	
	private Date createTime;
	
	private Date updateTime;
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public void setId(PK id) {
		this.id = id;
		
	}

	public PK getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "BasisModel [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
}
