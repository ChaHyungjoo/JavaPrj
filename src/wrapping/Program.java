package wrapping;

public class Program {

	public static void main(String[] args) {
//		int n = 3;
//		double m = 3.4;
//		String s = Integer.toString(n);
//		String s = String.valueOf(n);
//		String t = Double.toString(m);
//		double d = Double.parseDouble(t);
		
//		String name1 = "������";
//		String name2 = new String("������");
//		
//		System.out.println(name1==name2);	//�ּҸ� �� (���� ������ ����)
//		System.out.println(name1.equals(name2));		//��ü�� �޶� ���� ��
		
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
		
		String str = "��ȣ��, ���缮, �ŵ���, �輺��";
		String[] names = str.split(", ");
		
		System.out.println(names[1]);
		
		

	}

}
