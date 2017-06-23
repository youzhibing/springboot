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