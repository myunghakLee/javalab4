package kr.ac.embedded.kookmin.callback;

public class CallbackTest implements OnMaxNumberCb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbackTest callTest = new CallbackTest();
		Sum total = new Sum();

		total.setMaxNumber(50); // maxNumber = 50
		total.setOnMaxNumberCb(callTest); // callTest의 자료형은 CallbackTest이지만
											// CallbackTest는 OnMaxNumberCb를
											// implement했으므로 사용 가능하다.

		for (int i = 1; i <= 11; i++) {
			total.addNumber(i);
		}

		System.out.println("Total is" + total.getTotal());
	}

	@Override
	public void onMaxNumber(int number, int exceed) {
		// TODO Auto-generated method stub
		System.out.println("Current sum is" + number + " and exceeds" + exceed);
	}

}
