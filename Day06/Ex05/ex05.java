class ex05{
	public static void main(String args[]){
		int marks[][]={{75,45,65},{56,89,94},{58,25,68}};
		
		for(int i=0;i<3;i++){
			int max=marks[i][0];
			for(int j=0;j<3;j++)
			{
				if(max<marks[i][j])
				{
					max=marks[i][j];
				}
				System.out.print(marks[i][j]+" ");
			}
				System.out.println();
				System.out.println("Maxium is: "+max);
		}
	}
}
		
				