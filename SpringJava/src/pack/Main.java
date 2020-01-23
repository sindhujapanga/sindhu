package pack;

import javax.xml.bind.annotation.XmlNs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		Student obj=(Student)b.getBean("a");
		obj.display();
	}

} 

