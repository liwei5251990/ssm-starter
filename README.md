# 简介
一个基于 SSM + Shiro + Dubbo 的 RESTful Web 应用快速启动器。  

# 模块结构
```
ssm-starter
     ├─ssm-starter-common                       公共模块
     ├─ssm-starter-upms                         用户权限管理系统
     |        ├─ssm-starter-upms-common             公共模块
     |        ├─ssm-starter-upms-api                API 模块
     |        ├─ssm-starter-upms-provider           服务提供模块
     |        ├─ssm-starter-upms-server             Web 服务模块
```

# 技术选型
- 后端
  
| 技术 | 主要作用 | 说明 |
| ------------ | ------------ | ------------ |
| Spring Framework | 作为 bean 容器，提供 IoC 和 AOP | |
| Spring MVC | MVC 框架 | |
| MyBatis | ORM 框架 | |
| MyBatis Plus | MyBatis 增强工具，提供通用 CURD，以及代码生成功能等 | 项目需要，添加了自定义的代码生成模板 |
| Apache Shiro | 安全框架 | 由于 Shiro 对 RESTful 的支持不太好，所以对该框架进行了改造 |
| Redis | key-value 数据库，提供缓存支持 | |
| Druid | 数据库连接池 | |
| Dubbo | RPC 与服务治理 | |
| Velocity | 模板引擎 | 只使用它提供代码生成功能 |
| JWT | 令牌协议 | |
| ESAPI | Web 解决方案 | 主要使用它实现 Xss 消息过滤 |
| cglib | Java 代码生成类库 | 主要使用它的 BeanCopier 实现对象复制 |
| Lombok | Java 代码插入 | 自动生成 Getter 和 Setter，需要 IDE 安装 Lombok 插件 |
| Fastjson | JSON 处理器 | 主要使用它构建 JSON 处理工具，MVC 框架中使用的还是 Jackson |
| sequence | 分布式 ID 生成器 | 为 MyBatis Plus 默认集成，详情： <https://gitee.com/yu120/sequence> |
| Log4j 2 | 日志框架 | 日志门面使用 Slf4j |
| Hutool | Java 工具集 | 详情：<https://gitee.com/loolly/hutool> |

- 前端

# 整体设计
1. 暂时不使用 Spring Boot，而是选择单独的框架整合。后续会推出 Spring Boot 的版本。  
2. 前后端分离，该项目提供后端服务，前端分离出一个项目，使用 Vue.js。  
3. 整体架构风格为 RESTful。  
4. 权限框架暂时指定为 Shiro，该框架对于 RESTful 的支持可能不太好，需要改造。  
5. SSM 框架整合尽量减少使用 XML，更多的使用 Java Config 和注解。  
6. 使用 JWT 验证身份，Shiro 鉴权。  
7. 使用 Dubbo 提供分布式服务支持。  
8. 使用 Redis 提供缓存支持。  
9. 代码生成功能。  

# UI 选择
1. 前端框架使用 Vue.js，在这之上，尽量少的编写 Vue 组件，更多的使用现有的组件。  
2. 目前的 UI admin 有三种选择，一个是 iview 团队的 iview-admin，一个是基于 element-ui 的 vue-element-admin，还有一个是基于 ant-design 的 ant-design-vue。  



# 可能用到的参考
- RESTful
    - [restful-api-design-references](https://github.com/aisuhua/restful-api-design-references)
    - [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
    - [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
    - [使用 Spring HATEOAS 开发 REST 服务](https://www.ibm.com/developerworks/cn/java/j-lo-SpringHATEOAS/index.html?ca=drs-&utm_source=tuicool&utm_medium=referral)
- JWT
    - [The Ins and Outs of Token Based Authentication](https://scotch.io/tutorials/the-ins-and-outs-of-token-based-authentication)