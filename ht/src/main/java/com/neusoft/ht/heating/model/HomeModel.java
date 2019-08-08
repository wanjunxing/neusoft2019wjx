package com.neusoft.ht.heating.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 
 *   供热收费管理模块的居民类
 * @author 黄宇德
 *
 */
@Alias("Home")
@Data
public class HomeModel {
  
   private int homeno = 0;
   private String heatingcode = null;
   private HouseTypeModel houseTypeModel = null;
   private NeighbourHoodModel neighbourHoodModel = null;
   private String homename = null;
   private String buildingcode = null;
   private String departmentcode = null;
   private String floorcode = null;
   private String housecode = null;
   private float homearea = 0;
   private String direction = null;
   private String tel = null;
   private String mobile = null;
   private String mail = null;
   private String qq = null;
   private String heatingstatus = null;
   private float heatingarea = 0;
}
