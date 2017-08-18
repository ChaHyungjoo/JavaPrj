package wrapping;

public class Program {

	public static void main(String[] args) {
//		int n = 3;
//		double m = 3.4;
//		String s = Integer.toString(n);
//		String s = String.valueOf(n);
//		String t = Double.toString(m);
//		double d = Double.parseDouble(t);
		
//		String name1 = "아이유";
//		String name2 = new String("아이유");
//		
//		System.out.println(name1==name2);	//주소를 비교 (값을 비교하지 않음)
//		System.out.println(name1.equals(name2));		//객체는 달라도 값을 비교
		
//		String str1 = "Hello";
//		String str2 = str1.replace("Hell", "g");
//		
//		System.out.println(str1);
//		System.out.println(str2);
		
//		String str = "photo.jpg";
//		System.out.println(str.indexOf("."));
//		int endindex = str.indexOf(".");
//		System.out.println(str.substring(0, endindex));
//		System.out.println(str.substring(6, 9));
		
		String str = "강호동, 유재석, 신동엽, 김성주";
		String[] names = str.split(", ");
		
		System.out.println(names[1]);
		
		

	}

}
