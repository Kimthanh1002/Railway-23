package Enity;

public class Smartphone extends Telephone {
	private String used3G;
	private String photograph;

	public String getUsed3G() {
		return used3G;
	}

	public void setUsed3G(String used3g) {
		used3G = used3g;
	}

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public Smartphone(String used3g, String photograph) {
		used3G = used3g;
		this.photograph = photograph;
	}

	public Smartphone() {
	}

	@Override
	public String toString() {
		return "Smartphone \nused3G: " + used3G + "\nphotograph: " + photograph + "\n";
	}
	

}
