# spring boot相关注解
- @springBootApplication: spring boot 启动入口文件
- @Repository: 对应 DAO 类
- @Service: 对应业务逻辑类
- @Controller: 对应MVC中的控制器类
- @ResponseBody: 请求返回json
- @RestController: 请求返回json,相当于 @Controller + @ResponseBody
- @Component: 对应不太好区分的类可以使用
- @Entity: 对应项目中的实体类
- @Value: 项目启动时自动扫描yml配置文件, 将key注入进来
- @Autowired: 

- @Profiles: ?
- @EnableWebMvc: ?
- @Profile:
// 一类
- @Configuration: ?
- @ConfigurationProperties: ?
- @Bean: ?
- @EnableConfigurationProperties:
- @PropertySource: 
- @Order