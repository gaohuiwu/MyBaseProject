#####第一步：先将项目结构创建好（笔记：SSM重要框架介绍）
#####第二步：maven管理ssm的相关依赖
#####第三步：编辑配置文件
######spring-dao
1. 配置druid数据源(包含配置db.properties)
2. 配置sqlSessionFactory(扫描pojo包和mapper映射文件)mybatis
3. 配置Dao接口包(mybatis)
######mybits-config
  设置全局属性
######spring-service
1. 扫描包(包含子包)下所有使用注解的类型
2. 配置事务管理器
3. 配置基于注解的声明式事务
######spring-interceptor
######spring-redis
######spring-quartz







