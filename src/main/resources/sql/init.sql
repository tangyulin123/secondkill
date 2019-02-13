/** 产品信息表**/
CREATE TABLE `T_PRODUCT` (
`id`  int(12) NOT NULL AUTO_INCREMENT COMMENT '编号' ,
`product_name`  varchar(60) NOT NULL COMMENT '产品名称' ,
`stock`  int(10) NOT NULL COMMENT '库存' ,
`price`  decimal(16,2) NOT NULL COMMENT '单价' ,
`version`  int(10) NOT NULL DEFAULT 0 COMMENT '版本号' ,
`note`  varchar(255) NULL DEFAULT NULL COMMENT '备注' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB;
/**购买信息表**/
CREATE TABLE `T_PURCHASE_RECORD` (
`id`  int(12) NOT NULL AUTO_INCREMENT COMMENT '编号' ,
`user_id`  int(12) NOT NULL COMMENT '用户编号' ,
`product_id`  int(12) NOT NULL COMMENT '产品编号' ,
`price`  decimal(16,2) NOT NULL COMMENT '价格' ,
`quantity`  int(12) NOT NULL COMMENT '数量' ,
`sum`  decimal(16,2) NOT NULL COMMENT '总价' ,
`purchase_date`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '购买日期' ,
`note`  varchar(512) NULL DEFAULT NULL COMMENT '备注' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB;

