package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args)
	{
		/*
		SamsungTV tv = new SamsungTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		*/
		
		/*
		 실행 결과
		SamsungTV---전원 켠다.
		SamsungTV---소리 올린다.
		SamsungTV---소리 내린다.
		SamsungTV---전원 끈다.
		*/
		
		/*
		LgTV tv = new LgTV();
		
		tv.turnOn();
		tv.SoundUp();
		tv.SoundDown();
		tv.turnOff();
		*/
		
		/*
		LgTV---전원 켠다.
		LgTV---소리 올린다.
		LgTV---소리 내린다.
		LgTV---전원 끈다.
		*/
		
		// 같은 기능임에도 TV 별로 메소드 이름이 달라서 TVUser 대부분을 수정해야 한다.
		
		
		
		// 다형성 인터페이스 활용 후.. 
		/*
		TV tv = new SamsungTV(); // 참조하는 객체만 변경하면 삼성-lg 변경이 용이하다.
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		*/
		
		
		/*
		
		// 디자인 패턴 활용 후..
		BeanFactory factory = new BeanFactory();
		// BeanFactory 는 TV 객체를 생성해서 리턴한다.
		// 즉 클라이언트에 해당하는 TVUser는 자신이 필요한 객체를 직접 생성하지 않는다.
		// 다만 arg를 통해 요청했을 뿐..
		
		TV tv = (TV)factory.getBean(args[0]);
		// 명령행 매개변수를 전달하지 않으면 에러가 난다.
		// Run As - Run Configurations 에서 Arguments 선택 후 삼성, 또는 lg 전달
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		*/
		
		// ------- 9/24 (금)
		// 스프링 컨테이너 구동 및 테스트
		// TV 객체를 테스트 하는 클라이언트 
		// 환경설정 파일인 application Context.xml을 로딩하여 스프링 컨테이너 중 하나인 Generic~~을 구동
		
		// 1. Spring 컨테이너를 구동한다.
	    AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

	    /* 구동 결과 
	     INFO : org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from class path resource [applicationContext.xml]
	     INFO : org.springframework.context.support.GenericXmlApplicationContext - Refreshing org.springframework.context.support.GenericXmlApplicationContext@7fad8c79: startup date [Fri Sep 24 16:40:21 KST 2021]; root of context hierarchy
	     */
	    
	    // 2. Spring 컨테이너로부터 필요한 객체를 요청(Lookup)한다.
	    TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();

	}

}
