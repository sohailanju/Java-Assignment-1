
public class ineuron {

	public static void main(String[] args) {
		int n = 11;
		for(int i=0;i<n;i++) {
			
			// Logic for Printing "I"
			for(int j=0;j<n;j++) {
				if(j==n/2 || i==0 || i==n-1) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for Printing "N"
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for Printing "E"
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2 || i==n-1 || j==0) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for Printing "U"
			for(int j=0;j<n;j++) {
				if(j==0 && i<(n-1) || j==(n-1) && i<(n-1) || i==(n-1) && j>0 && j<(n-1)) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for Printing "R"
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<(n-1)) || 
						(j==(n-1) && i>0 && i<(n-1)/2) || 
						(i==(n-1)/2 && j<(n-1)) ||
						(i==j && i>(n-1)/2 && j>(n-1)/2)) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for Printing "O"
			for(int j=0;j<n;j++) {
				if( (j==0 && i>0 && i<(n-1)) || 
					(i==n-1 && j>0 && j<(n-1)) || 
					(i==0 && j>0 && j<(n-1)) || 
					(j==(n-1) && i>0 && i<(n-1)) ) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.print(" ");
			
			// Logic for printing "N"
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==n-1) 
					System.out.print("*"); 
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
