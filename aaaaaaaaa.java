public class Linearsearch {

	public static void main(String[] args) {
		int a[]=new int[] {1,1,2,2,3,3,4,5,5,6,6};
		for(int x=1;x<a.length-1;x++)
		{
			if(a[x]!=a[x+1] && a[x-1]!=a[x])
			{
				System.out.println("unique element is "+a[x]);
			}
		}

	}

}
