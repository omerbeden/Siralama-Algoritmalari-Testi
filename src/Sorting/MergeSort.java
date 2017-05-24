package Sorting;


public class MergeSort {
      public MergeSort(){
        
    }
	private void merge(int dizi[], int l, int m, int r){
	
		//gecici dizilerin boyutlari bulundu
		int n1 = m - l + 1;
		int n2 = r - m;

	
		int L[] = new int [n1];
		int R[] = new int [n2];

	    //asil dizinin ortasina kadar olanlar left e sonrasinda olanlar right a kopyalandi
		for (int i=0; i<n1; ++i)
			L[i] = dizi[l + i];
		
		for (int j=0; j<n2; ++j)
			R[j] = dizi[m + 1+ j];


	     

		//gecici diziler birlestirilecek
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2){
		
			if (L[i] <= R[j])
			{
				dizi[k] = L[i];
				i++;
			}
			else
			{
				dizi[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1){
		
			dizi[k] = L[i];
			i++;
			k++;
		}

		
		while (j < n2){
		
			dizi[k] = R[j];
			j++;
			k++;
		}
		
	}

	
	public void mergeSort(int dizi[], int l, int r){
	//buyuk olan sabit tutuldu kucuk elemanlari buyuk e gore bakip yeni buyuk eleman gorene kadar diger elemanlari karsilastirdi
	
		if (l < r)
		{
			//ortadaki eleman bulundu
			int m = (l+r)/2;

			//ortaya kadar olanlar ve ortadan sonrakiler metoda gonderilerek siralandi
			mergeSort(dizi, l, m);
			mergeSort(dizi , m+1, r);

			// veriler birlestirildi
			merge(dizi, l, m, r);
		}
	}
}
	
	


	



