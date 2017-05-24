package Sorting;

public class InsertionSort {
      public InsertionSort(){
        
    }
	public void insertionSort(int dizi[]) {
		int tmp;
		
		for(int i=1;i<dizi.length;i++){
			tmp=dizi[i];
			 int j=i;
			 
			for( j=i;j>0;j--){
				
				if(dizi[j]<dizi[j-1]){
					dizi[j]=dizi[j-1];
					dizi[j-1]=tmp;
					
				}
			}
		}
	}
}
