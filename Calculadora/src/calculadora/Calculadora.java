package calculadora;

public class Calculadora {

	private int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int add(int a, int b) {
		int ans  = a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		int ans  = a - b;
		return ans;
	}
	
	public int div(int a, int b) {
		if (a == 0 || b == 0) {
			throw new ArithmeticException("No puedes dividir entre 0...");
		}
		
		ans = a  / b;
		return ans;
	}
	
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int sub(int v) {
		ans -= v;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans = 0;
	}
	
	public void operacionOptima() {
		for(;;);
	}
}
