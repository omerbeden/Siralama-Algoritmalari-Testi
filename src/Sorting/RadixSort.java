package Sorting;

public class RadixSort {
      public RadixSort(){
        
    }
	
	
	private int getMax(int dizi[],int l){    		//l =lenght ,en buyuk sayiyi hesapl�yor cunku en buyuk sayi kadar basamak olacagindan
			int mx=dizi[0];		
			for(int i=0;i<dizi.length;i++){
				if(dizi[i]>mx)
					mx=dizi[i];
			}
			
		return mx;
   }
	
	private void countingSort(int dizi[],int l,int dg){			//bucket siralama ile de yapilabilir ama o listlerde daha iyi olur.
		int count[]=new int[10];
		int output[]=new int[l];
		int i;                                     
		
		
		for(i=0;i<l;i++)
			count[(dizi[i]/dg)%10]++;				//birler basamagindaki elemanlar count dizisinde ayni indisteki degeri 1 arttiriyor.
			
		for(i=1;i<10;i++)                			//10 tane rakam oldugundan 10 a kadar gidiyor.Kumelatif
			count[i]=count[i]+count[i-1];
		
		for(i=l-1;i>=0;i--){
			output[count[(dizi[i]/dg)%10]-1]=dizi[i];       //ilgili basamagi buluyor.bunu yeni dizide hangi indise yazacagini 1 cikararak buluyor.
			count[(dizi[i]/dg)%10]--;					  //sonra bir tanesini yazdigindan sayma dizisinden 1 cikariyor kac tane daha yazacagini gormek icin.
		}
		
		
		for(i=0;i<l;i++)
			dizi[i]=output[i];							//asil dizi siralanmis dizi ile degistiriliyor.
    }

	
	public void radixSort(int dizi[],int l){
		
		int max=getMax(dizi, l);
		for(int dg=1; max/dg>0; dg*=10){   				//en buyuk sayi kac haneli ise o kadar countingSort yapiyor.
			countingSort(dizi,l,dg);
		}
    }
	
}
	

