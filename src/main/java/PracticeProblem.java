public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static boolean validIndex(int[] arr, int num){
		try{
			int num2 = arr[num];
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
	}
	public static int divide(int huzz, int buzz) {
        try {
            return huzz / buzz;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
	public static int safeConvertStringtoInt(String str){
		try{
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e){
			return 0;
		}
	}

}
