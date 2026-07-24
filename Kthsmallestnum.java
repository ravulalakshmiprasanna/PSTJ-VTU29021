import java.util.Arrays;
public class Kthsmallestnum{
public static void main(String[] args){
int[] num = {722,982,81,82,903,9013};
int k = 4;
Arrays.sort(num);
System.out.println(Arrays.toString(num));
int kth_Smallest =k-1;
System.out.println("th Kth Smallest element : "+num[kth_Smallest]);
}
}