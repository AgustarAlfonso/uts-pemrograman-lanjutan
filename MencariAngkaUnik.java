import java.util.Scanner;
public class MencariAngkaUnik {
    void kondisiUnik()
    {
        int[] array = new int[20];
        Scanner input = new Scanner(System.in);
        boolean kondisi = false;

        for(int i=0;i<array.length;i++)
        {
            array[i] = input.nextInt();
        }
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j< array.length;j++){
                if(array[i] == array[j])
                {
                    kondisi =  true;
                }
            }
        }

        if(kondisi==true)
        {
            System.out.println("True! ada angka yang sama!");
            jumlahYangSama(array);
        }
        else
        {
            System.out.println("False! tidak ada angka yang sama");
        }
    }

    private void jumlahYangSama(int[] array)
    {
        for (int i=0; i<array.length;i++)
        {
            boolean sudahdibandingkan = false;
            for(int j=0;j<i;j++)
            {
                if (array[i] == array[j])
                {
                    sudahdibandingkan = true;
                    break;
                }
            }
            if (sudahdibandingkan==true)
            {
                continue;
            }
            int sama = 1;
            for (int j = i+1;j<array.length;j++)
            {
                if (array[i] == array[j])
                {
                    sama++;
                }
            }
            if (sama > 1)
            {
                System.out.println(array[i] + " ada " + sama);
            }
        }
    }
}
