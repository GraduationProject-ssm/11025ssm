package com.entity.view;

import com.entity.ShangpinweihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品维护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-09 14:52:21
 */
@TableName("shangpinweihu")
public class ShangpinweihuView  extends ShangpinweihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinweihuView(){
	}
 
 	public ShangpinweihuView(ShangpinweihuEntity shangpinweihuEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinweihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}