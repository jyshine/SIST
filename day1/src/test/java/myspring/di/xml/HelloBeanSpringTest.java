package myspring.di.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //고정
@ContextConfiguration(locations="classpath:config/beans.xml") //테스트하고자하는 xml //설정 정보가 어떤 것 인지 알려줌
public class HelloBeanSpringTest {

	@Autowired		
	ApplicationContext context;		//설정 정보에서 주입 받겠다 spring에서 제공하는 클래스
	
	@Test					//jUnit 라이브러리가 있어야 한다. 부가적인 부분
	public void bean1() {
		Hello hello =(Hello)context.getBean("hello"); //설정 bean에 hello로 
		
		assertEquals("Hellospring", hello.sayHello());
		//jUnit에서 제공하는 static class
		
		hello.print();
	}
}
