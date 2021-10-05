package polymorphism;

public class SamsungTV implements TV {

	// 10/5(화) bean 엘리먼트 속성
	// init-method 속성
	 public void initMethod() {
		 System.out.println("객체 초화 작업 처리..");
	 }
	 
	 public void destroyMethod() {
		 System.out.println("객체 삭제 전에 처리할 로직 처리..");
	 }
	
    // 구동된 컨테이너로부터 SamsungTV 객체를 얻어내 보자.
    // SamsungTV 객체가 언제 생성되는지 확인하기 위해서 기본 생성자를 추가
	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}

	// 다형성을 활용한 코드(인터페이스 메소드 재정의 필요)

	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");

	}
}
