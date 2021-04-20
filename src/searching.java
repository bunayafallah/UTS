import java.util.Arrays;
  
public class searching{
    public static void main(String[] args)
    {
        int arr[] = {3,10,4,2,8};
        Arrays.sort(arr);
  
        int key = 8;
        int res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " indekas pointer 2 = " 
                                                  + res);
        else
            System.out.println(key + "cari dikanan");
  
        key =8;
        res = Arrays.binarySearch(arr, key);
        if (res >= 0)
            System.out.println(key + " indeks pointer 3 = " 
                                                  + res);
        else
            System.out.println(key + " data 8 telah ditemukan pada indeks ");
    }
}
