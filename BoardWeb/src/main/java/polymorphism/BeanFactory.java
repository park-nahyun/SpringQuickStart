package polymorphism;

public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}
		
		else if(beanName.contentEquals("lg")) {
			return new LgTV();
		}
		
		return null;
	}
	
	/*
	 Factory 패턴 : 클라이언트에서 사용할 객체 생성을 캡슐화 하여 
	 TVUser 와 TV를 느슨한 결합 상태로 만들어준다.  
	 */ 
	
}
