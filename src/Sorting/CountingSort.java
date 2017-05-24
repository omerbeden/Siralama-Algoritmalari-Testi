package Sorting;
public class CountingSort {
      public CountingSort(){
        
    }
	 public  int[] countingSort(int[] arr) {
		 int[] sorted = new int[arr.length];
		 
		 int min = arr[0];
		 int max = arr[0];
		 
		 for (int i = 1; i < arr.length; i++) {
			 if (arr[i] < min) {
				 min = arr[i];
			 } 	else if (arr[i] > max) {
				 max = arr[i];
			 }
		 }
 
		 int[] count = new int[max - min + 1];    //dizi 0.indeksten baslayacagindan +1 ordan geliyor
	 
			 for (int i = 0;  i < arr.length; i++) {
				 count[arr[i] - min]++;           //mesela dizi[4]=3 olsun. gecici dizideki 0 olan 3. indisi 1 arttiriyor.bastaki 0 i saymazsak 3 sayisi 3.indiste olmus oluyor.
			 }

			 	count[0]--;
			 for (int i = 1; i < count.length; i++) {
			 	count[i] = count[i] + count[i-1];   // her bir indis bir Onceki indis ile toplaniyor.Boylece ayni elemandan birden fazla olma durumu daha iyi saptanmis oluyor
			 }
 
			 for (int i = arr.length - 1; i >= 0; i--) {
				 sorted[count[arr[i] - min]--] = arr[i];        //burada gecici dizideki elemanlar sirayla yeni bir diziye yazdiriyor.
			 }
 
		 return sorted;
	  }
}	
	


