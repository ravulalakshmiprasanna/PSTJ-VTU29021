

import java.util.Arrays;
public class Binarysearch{
public static void main(String[] args){

int[] num = {15,50,7,32,9,26};
int target = 9;
int low = 0;
int high = num.length - 1;
int foundindex =-1;

Arrays.sort(num);
System.out.println(Arrays.toString(num));

while (low<=high){
int mid=(low+high)/2;

if (num[mid]==target){
foundindex= mid;
break;
}

if(num[mid]<target){
low=mid+1;
}
else{
high=mid-1;
}
}

if(foundindex==-1){
System.out.println("the target was not found in the array");
}
else{
System.out.println("target was found "+target+" at index position :"+foundindex);
}
}
}

