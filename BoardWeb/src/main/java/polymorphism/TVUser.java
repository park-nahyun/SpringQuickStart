package polymorphism;

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
		TV tv = new SamsungTV(); // 참조하는 객체만 변경하면 삼성-lg 변경이 용이하다.
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}

}
