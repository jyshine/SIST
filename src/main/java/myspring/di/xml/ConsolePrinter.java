package myspring.di.xml;

public class ConsolePrinter implements Printer {
	public void print(String message) {	
		//넘겨받은 문자열 표준 출력 장치(운영체제에서 설정된 표준 출력장치)로 출력
		System.out.println(message);
	}
}
