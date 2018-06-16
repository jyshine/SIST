package myspring.di.xml;

public class Hello {
	private String name;
	private Printer printer;
//	private Printer printer = new ConsolePrint();
//	private Printer printer = new StringPrinter();
	public void setName(String name) {	//값을 주입 받기 위한 메소드
		this.name = name;
	}

	public void setPrinter(Printer printer) {	//참조 자료
		this.printer = printer;
	}

	public String sayHello() {
		return "Hello" + name;
	}

	public void print() {	//어떤 객체가 주입되었는가에 따라서 다르게 동작한다. 
							//다형성을 활용 => 유연하게 동작한다.
		printer.print(sayHello());
	}

}
