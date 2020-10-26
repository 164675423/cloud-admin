# springboot-admin

#### 介绍

本项目是一个前后端分离的管理系统，采用当前流行的技术开发，后端使用SpringBoot2.1，SpringCloud，结合Mybatis-plus，Redis，Kafka...等常用组件,前端采用React，Redux，Ant design构建的单页应用

* 线上项目 http://118.178.254.170/
* 目前已实现用户管理及授权管理，做到按钮级的动态权限控制

#### 架构图

<img src="https://gitee.com/sowho.github.io/springboot-admin/raw/develop/doc/1.png"/>

#### 项目结构

springboot-admin  
├── access-management  -- 权限管理，包含用户角色资源等  
├── base-common -- 工具类等公用  
├── gateway -- 基于Spring Cloud Gateway的微服务API网关服务  
├── file-storage -- 文件服务，支持local/ftp/fastdfs  
├── parent -- maven pom依赖版本管理  
└── web-client -- 前端演示项目  

#### 如何运行

* 后端:
      注册中心需自行搭建，调整各个服务中的bootstrap.yml文件，分别启动 gateway，access-management，如果需要debug可以访问 localhost:{port}/swagger-ui.html
* 前端:  
  * 1.执行 yarn install 安装依赖  
  * 2.调整 webpack.dev.js 中的代理地址为后端网关地址
  * 3.执行 yarn start 运行项目