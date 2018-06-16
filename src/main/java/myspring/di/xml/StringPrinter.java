package myspring.di.xml;

public class StringPrinter implements Printer {

	private StringBuffer bf = new StringBuffer();

	@Override
	public void print(String message) {
		bf.append(message);
	}

	public String toString() {
		return bf.toString();
	}

}
