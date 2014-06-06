package com.liusy.common.service.system.impl;

import java.io.Serializable;
import java.util.List;

import com.liusy.common.dao.SysDeptDao;
import com.liusy.common.model.SysDept;
import com.liusy.common.service.system.SysDeptService;
import com.liusy.core.dao.model.PageQuery;
import com.liusy.core.exception.DAOException;
import com.liusy.core.exception.ServiceException;

public class SysDeptServiceImpl implements SysDeptService {
	
	public SysDept findSysDept(Serializable id) throws ServiceException {
		try {
			return sysDeptDao.get(id);
		}
		catch (DAOException e) {
			throw new ServiceException("查询数据库错误。");
		}
	}

	public List<SysDept> findSysDepts(Serializable orgId) throws ServiceException {
		List<SysDept> list;
		try {
			list = sysDeptDao.findByField(SysDept.PROP_ORG_ID, new Integer(orgId.toString()));
		}
		catch (Exception e) {
			throw new ServiceException("查询数据库错误。");
		}
		return list;
	}

	public PageQuery querySysDept(PageQuery pageQuery) throws ServiceException {
		try {
//			PageQuery query = sysDeptDao.queryBySelectId(pageQuery);
//			pageQuery.setRecordSet(query.getRecordSet());
//			pageQuery.setRecordCount(query.getRecordCount());
			return pageQuery;
		}
		catch (Exception e) {
			throw new ServiceException("查询数据库错误。");
		}
	}

	public List<SysDept> findAllDept() throws ServiceException {
		try {
			return sysDeptDao.findAll();
		}
		catch (Exception e) {
			throw new ServiceException("查询数据库错误。");
		}
	}
	
	private SysDeptDao	sysDeptDao;

	/**
	 * 注入DAO
	 * 
	 * @see com.thunisoft.core.service.SysDeptService#setSysDeptDao(SysDept
	 *      sysDeptDao)
	 */
	public void setSysDeptDao(SysDeptDao sysDeptDao) {
		this.sysDeptDao = sysDeptDao;
	}
}
