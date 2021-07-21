package com.myprog.program;
public class MM {
	public static void main(String[] args) {
		int [][]a= {{1,9,3},{0,2,3},{4,3,4}};
		int [][]b= {{8,4,3},{7,2,3},{6,1,0}};
		int row1=a.length;
		//int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		if(row1!=col2) {
			System.out.println("length of row1 and col2 are not same");
		}
		else {	
			int [][]mm=new int[row1][col2];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<row2;k++) {
						mm[i][j]+=a[i][k]*b[k][j];//multiplication
					}
				}
			}
			System.out.println("THE MATRIX PRODUCT IS: ");
			for(int i=0;i<mm.length;i++) {
				for(int j=0;j<mm[0].length;j++) {
					System.out.print(mm[i][j]+"	");
				}System.out.println();
			}
			
		}
	}
}