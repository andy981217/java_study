package workout;

public class SoundableExample {
	//메소드
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
	}

}
