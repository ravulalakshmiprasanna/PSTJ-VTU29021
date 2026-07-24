import java.util.Arrays;
public class Maximum{
public static void main(String[] args){
int[] num = {5,2,9,93,7,6,8,4,9};
Arrays.sort(num);
System.out.println(Arrays.toString(num));
int max = num[num.length-1];
System.out.println("Maximum n integer of the given array : "+max);
}
}