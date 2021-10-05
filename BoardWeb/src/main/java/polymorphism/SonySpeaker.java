package polymorphism;

public class SonySpeaker {

	// 10/5 의존성
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker --- 소리 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker --- 소리 내린다.");
	}
}
