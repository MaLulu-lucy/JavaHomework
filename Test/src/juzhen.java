import javax.swing.*;
public class juzhen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = JOptionPane.showInputDialog("输入此方阵的阶数");
		int n = Integer.parseInt(s);
		int m = 0;
		int k = 0;
		int[][] a = new int[n][n];
		if(n %2 ==0) {
			m=n;
		}else {
			m=n/2+1;
		}
		for(int i=0;i<m;i++) {
			for(int j=i;j<n-i;j++) {
				k++;
				a[j][i] = k;
			}
			for(int j=i+1; j<n-i;j++) {
				k++;
				a[n-1-i][j]= k;
			}
			for(int j=n-i-2;j>=i;j--) {
				k++;
				a[j][n-i-1] =k;
			}
			for(int j=n-i-2;j>=i+1;j--) {
				k++;
				a[i][j] = k;
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				if(a[i][j] <10) {
					System.out.print(" ");
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}