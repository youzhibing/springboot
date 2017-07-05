代码中dao层实现由2种
	1、jpa
		public interface PersonRepository extends JpaRepository<Person, Integer>
	2、mybatis
		无论哪种方式对bean取别名，都不区分大小写，例如：别名是Person，能匹配映射文件中的person、Person、peRSon等； 应该是某个地方进行全小写化或全大写化。
		mybatis.type-aliases-package=com.yzb.lee.springboot.domain， 配置指定包下bean的别名
		@MapperScan("com.yzb.lee.springboot.dao.mybatis")，浏览mapper接口;
		
		
		a、全注解
			mapper接口中用注解实现操作、sql以及映射
		b、xml
			mybatis-config.xml
			mapper/person.xml
		最好只用其中一种！
springboot test
	https://spring.io/guides/gs/testing-web/
	里面针对不同的模块有不同的测试方法
	
	/** 
	 *  这里指定的classes是可选的。如果不指定classes，则spring boot会启动整个spring容器，很慢（比如说会执行一些初始化，ApplicationRunner、CommandLineRunner等等）。不推荐 
	 *  指定的话，就只会初始化指定的bean，速度快，推荐 
	 */  
	@SpringBootTest(classes={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, MybatisScanConfiguration.class}) 
	
	禁用自动配置 
	@SpringBootApplication(exclude = MongoAutoConfiguration.class)

redis
	设置可远程访问
		修改绑定ip，redis.conf文件中将 bind 127.0.0.1改成bind ip
	以认证方式启动
		开启redis.conf中密码配置:vi 命令模式下 /# requirepass, 查找，打开注释，并设置自己的密码(myredis)
		启动redis-server:./redis-server /opt/redis-3.2.9/redis.conf
	客户端连接
		./redis-cli -h ip -p 6379 -a 新密码
		
		
mongodb
	认证方式启动:
		mongod --dbpath E:\mongodb\db –auth
	认证方式登录:
		mongo -u yzb -p 123456 --authenticationDatabase "admin"
		
	public interface MongoUserRepository extends MongoRepository<MongoUser, String> 中的MongoUser应与mongodb的collection对应上(mongoUser)
	
	
	
	
	