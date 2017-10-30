import java.util.*;
public class Main {
//計算薪水&加班
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x;
	x =in.nextInt();
	if(x<=40) {
		x = x * 100;
		System.out.printf("%d", x);
	}
	else
		x=(x-40)*120+4000;
	System.out.printf("%d",x);
	          }

}
