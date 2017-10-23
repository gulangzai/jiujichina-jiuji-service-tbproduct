package com.jiuji.cn.business.tbproduct.dao;

import java.util.HashMap;
import java.util.List;

import com.jiuji.cn.business.tbclass.vo.TbClass;
import com.jiuji.cn.business.tbproduct.vo.TbProduct;

import com.lanbao.base.PageData;
import com.lanbao.dao.BaseDao;
import com.lanbao.mybatis.MyBatisBaseDao;

public interface TbProductDao extends BaseDao{

	List<PageData> findNewGood() throws Exception;

	List<PageData> findNewHot() throws Exception;

	List<PageData> findNewSpecial() throws Exception;

	List<PageData> queryByType(TbProduct tproduct) throws Exception;

	List<PageData> queryByParentSku(PageData tproduct) throws Exception;

	List<PageData> findByColor(PageData tproduct)throws Exception;

	List<PageData> findBySize(PageData tproduct)throws Exception;

	List<HashMap> searchProduct(TbProduct tProduct) throws Exception;

	List<PageData> findByClass(TbClass tbClass) throws Exception;

}
