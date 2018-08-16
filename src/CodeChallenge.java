public class CodeChallenge {

	public static int answer(int n) {

		String binaryNum = Integer.toString(n, 2);

		int counterA = 0;
		int counterB = 0;
		boolean foundOne = false;
		for (int i = 0; i < binaryNum.length(); i++) {
			if (binaryNum.charAt(i) == '1') {
				counterA = counterA + 1;
				foundOne = true;
			}
			if (counterA > counterB) {
				counterB = counterA;
				counterA = 0;
			} else {
				counterA = 0;
			}

		}
		return counterB;
	}

}