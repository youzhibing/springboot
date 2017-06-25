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

redis
	设置可远程访问
		修改绑定ip，redis.conf文件中将 bind 127.0.0.1改成bind ip
	以认证方式启动
		开启redis.conf中密码配置:vi 命令模式下 /# requirepass, 查找，打开注释，并设置自己的密码
		启动redis-server:./redis-server /opt/redis-3.2.9/redis.conf
	客户端连接
		./redis-cli -h ip -p 6379 -a 新密码