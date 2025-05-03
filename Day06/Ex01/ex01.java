class ex01{
	public static void main(String args[]){
		int marks[][]=new int[2][2];
		marks[0][0]=75;
		marks[0][1]=85;
		marks[1][0]=100;
		marks[1][1]=95;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		