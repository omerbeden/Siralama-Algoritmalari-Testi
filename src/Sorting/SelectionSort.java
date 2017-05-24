package Sorting;

public class SelectionSort {
      public SelectionSort(){
        
    }
	public void selectionSort(int dizi[]) {
		int min,tmp;
		
		for(int i=0;i<dizi.length-1;i++){
			
			min=i;
			for (int j = i+1; j < dizi.length; j++) {
				if(dizi[j]<dizi[min]){
					min=j;
				}
			}
			tmp=dizi[i];
			dizi[i]=dizi[min];
			dizi[min]=tmp;
			
		}
	}
}
