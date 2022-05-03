
public class Teste {

	public static void main(String[] args) {
		
		Integer[] vi = {4, 6, 8, 1, 0};
		Double[] vd = {0.5, 0.1, 2.5, 9.0};
		String[] vs = {"ana", "carol", "bia", "josé"};
		
		imprimir(vi);
		imprimir(vd);
		imprimir(vs);
	}
	
	//método genérico --> método parametrizado
	public static <T> void imprimir(T[] v) { //só trabalha com classes
		for (T t : v) {
			System.out.println(t+" ");
		}
		System.out.println();
	}
	
	//sobrecarga de método
// 	public static void imprimir(int[] v) {
//		for(int i : v) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void imprimir(double[] v) {
//		for(double i : v) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void imprimir(String[] v) {
//		for(String i : v) {
//			System.out.println(i+" ");
//		}
//		System.out.println();
//	}
//	
}
