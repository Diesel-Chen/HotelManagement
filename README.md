# 酒店管理系统


## 概述
 本系统是学习了JavaWeb之后做的一个大作业，前端使用html+css+js，没有使用任何框架。后端也没有使用任何框架，通过servlet来接受页面发的请求返回响应的数据。jsp页面通过EL表达式获取值。
    
## 主要功能模块
- 管理员注册：注册一个新的管理员账号；
- 管理员登录：管理员通过账号和密码进行登录；
- 用户注销：注销当前用户；
- 个人中心：用户可以添加酒店名称，完善个人信息；
- 导航查询：查询出所有分类显示在首页导航位置
- 房型查询：
	- 首页的关于所有房型的查询，并显示房号，类型，以及所处状态；
	- 不同状态的房型分别有多少间
	- 按照房号查询，按照楼层查询，按照所处状态查询，按照所处类别查询
- 订单页面：
	- 订单页面实现分页查询出所有订单，一个页面显示7条数据
	- 按照订单状态查询，按照入住人姓名查询，事实显示查询的总记录是多少
	- 与房型实现联动变化，如果订单的状态是待处理，说明是新来的一条订单当点击确认预订，订单状态由已待处理变化为已预订，相应系统为为这个订单下单的房型，从已有房型中空房随机分配一个给该用户，如果顾客想取消预订，管理员点击取消预订则订单状态由已预订变化为已取消，并且首页把刚才虚拟分配给用户的房间状态由已预订变为空房状态
- 设置功能：
	- 普通用户是不能够进行设置的，只有经过登录才能进行设置
	- 设置主要一是对自己酒店不同房型的设置--分类管理
	- 二是添加不同的房型--房型管理
	- 查询所有房型采用的是分页查询
## 功能界面
### 用户登录
![](https://note.youdao.com/yws/api/personal/file/92B542382BE244E7BC7A9858DA71FEBC?method=download&shareKey=4556ac54f0d9cba46c894648a033f5ad)
### 用户注册
![img](https://note.youdao.com/yws/api/personal/file/F4BD7CFBF9C34BCD83DFF0FDB241A46A?method=download&shareKey=117fa849de550ef046c2afc4a988d3a1)
### 房型查询
![img](https://note.youdao.com/yws/api/personal/file/787584832576473CB25E8956FA0FF761?method=download&shareKey=8f27e20e83a5212e9d9c576adbf80406)
### 订单管理
![img](https://note.youdao.com/yws/api/personal/file/4CE6CD5A7D614EBB9449BF57E9919104?method=download&shareKey=f6fbeb46ca0585e528e1f3f6e5dfbee7)
### 设置分类管理
![img](https://note.youdao.com/yws/api/personal/file/54E31F7602814BA5B7644B749B41ED65?method=download&shareKey=fa827bbebcb9983f565166ea3a1dd431)

设置客房管理

![img](https://note.youdao.com/yws/api/personal/file/E3D6855C52DD414D81117AA595491BFB?method=download&shareKey=ac5a7b33cc6e7228cef9d6bce353740c)

## 用到相关知识总结
- 掌握了JSP的基本语法
- 理解了面向对象编程特点
- 理解了内置对象，JavaBean，Servlet的使用
- 掌握了JSP与不同数据库进行连接
- 掌握了MVC的开发模式
- 使用一些jar包简化代码
C3P0连接池 DbUtils ,BeanUtils ,JSTL标准标签库 ，mysql数据库驱动包
- Beanutils框架 ，C3P0连接池 DbUtils , BeanUtils,JSTL标准标签库
## 心得体会
- 本次JAVA程序设计主要是用JAVA和MySQL数据库实现酒店管理系统，其系统主要完成以下功能模块：房型状态界面：主要显示各个类型的房型、房间号、所在楼层和房间可否入住状态；订单页面：主要实现管理员对订单的确认和取消操作以及根据订单状态查询符合条件订单和根据入住人姓名查询此入住人订单；登录页面：主要实现管理员的账号密码登录和注册功能；设置页面：主要实现了管理员根据酒店实际情况进行添加房型的操作。
学习总结：我们在亲自设计一个程序的时候，就能够切实的深入的去了解一个程序的真正架构和内容的组成。并且在设计的时候要考虑到酒店系统管理员需要的一些功能，在设计程序的同时也在学习和探索。使我们面对对象的编程思想和风格有了进一步的认识和体会。



 

