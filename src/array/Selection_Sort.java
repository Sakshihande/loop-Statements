package array;

public class Selection_Sort {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {38,52,9,18,6,62,13};
		int min = 0 ,temp=0;
		for (int i =0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{ 
				if(a[j]<a[min])
				{
					min=j;
					}
				}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i =0;i<a.length;i++);
		{
	
			
			
			
			System.out.print(a[min]+ " ");
			
			
		}
			
		}
			}



















































