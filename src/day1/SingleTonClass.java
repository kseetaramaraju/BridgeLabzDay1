package day1;

public class SingleTonClass {
	public static void main(String[] args) {

		AdharCard ad=AdharCard.helper();
		System.out.println(ad);

		AdharCard ad1=AdharCard.helper();
		System.out.println(ad1);

	}

}
