package helloworld;

public class A5P7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a=65;
for(int i=5;i>=1;i--) {
	for(int k=4;k>=i;k--) {
		System.out.print("   ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print(a+"  ");
		a++;
	}
	System.out.println("\n");
}
	}

}
