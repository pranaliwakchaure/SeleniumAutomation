package Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String[][] str=new String[3][2];
		
		//ROW 1
		str[0][0]="U1";
		str[0][1]="P1";
		
		//ROW 2
				str[1][0]="U2";
				str[1][1]="P2";
				
		//ROW 3
				str[2][0]="U3";
				str[2][1]="P3";
				for(int r=0; r<3; r++)
				{
					for(int c=0; c<2; c++)
					{
		             System.out.println(str[r][c]);
					}
				}

	}

}
