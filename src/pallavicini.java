import java.util.Scanner;


public class pallavicini
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				es1();
				break;
			case 2:
				//Inserire metodo statico
				break;
			case 3:
				//Inserire metodo statico
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. 1 - " + "dati 2 array crearne un terzo contenente i valori in ordine crescente");
		System.out.println("2 - Es n. * - Titolo es. *");
	}
	//array3[0]= (int) (Math.random()*10);
	static void swap (int[] array, int a, int b)
	{
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	static void es1()
	{
		int[] array1= new int[5];
		int[] array2= new int[5];
		int[] array3= new int[10];

		for(int i=0; i<array1.length;  i++)
		{
			System.out.println("inserire il valore " + i + " del primo array" ); 
			array1[i]= Integer.parseInt(in.nextLine());
		}

		for(int i=0; i<array2.length;  i++)
		{
			System.out.println("inserire il valore " + i + " del secondo array"  ); 
			array2[i]= Integer.parseInt(in.nextLine());			
		}
		
		for(int i=0; i<5; i++)
		{
			array3[i]=array1[i];
		}
		
		for(int j=0; j<array2.length; j++)
		{
			array3[j+array1.length]=array2[j];				
		}

		for (int i=0; i<array1.length; i++)
		{
			System.out.println("Elemento " + i + " di array1 " + array1[i]); 
		}
		
		for (int i=0; i<array2.length; i++)
		{
			System.out.println("Elemento " + i + " di array2 " + array2[i]); 
		}
		
		for (int i=0; i<array3.length; i++)
		{
			System.out.println("Elemento " + i + " di array3 " + array3[i]); 
		}
		
		for(int j=0; j<array3.length-1; j++)
		{
			for(int i=0; i<array3.length-1; i++)
			{
				if(array3[i]>array3[i+1])
					swap (array3, i,i+1);
			}
		}
		for (int i=0; i<array3.length; i++)
		{
			System.out.println("Elemento " + i + " di array3 ordinato  " + array3[i]); 
		}
	}
	
}
