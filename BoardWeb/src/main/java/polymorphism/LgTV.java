package polymorphism;

public class LgTV implements TV {

// 다형성을 활용하지 않은 코드
//	public void turnOn() {
//		System.out.println("LgTV---전원 켠다.");
//	}
//
//	public void turnOff() {
//		System.out.println("LgTV---전원 끈다.");
//	}
//
//	public void soundUp() {
//		System.out.println("LgTV---소리 올린다.");
//	}
//
//	public void soundDown() {
//		System.out.println("LgTV---소리 내린다.");
//	}

	// 다형성을 활용한 코드(인터페이스 메소드 재정의 필요)

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올린다.");
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");

	}

}
