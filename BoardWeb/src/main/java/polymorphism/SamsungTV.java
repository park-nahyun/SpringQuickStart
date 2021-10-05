package polymorphism;

public class SamsungTV implements TV {

	
	// 10/5(화) 의존성 실습
	private SonySpeaker speaker;
	
    // 구동된 컨테이너로부터 SamsungTV 객체를 얻어내 보자.
    // SamsungTV 객체가 언제 생성되는지 확인하기 위해서 기본 생성자를 추가
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성(1)");
	}

	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV 객체 생성(2)");
		this.speaker = speaker;
		// SonySpeaker 객체를 매개변수로 받아서 멤버변수로 선언된 speaker 를 초기화
	}

	// 다형성을 활용한 코드(인터페이스 메소드 재정의 필요)

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}
	

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
