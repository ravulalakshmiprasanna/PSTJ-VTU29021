//imort java.util.Arrays;
public class Possible_pairs{
public static void main(String[] args){
int[] num ={52,73,82,92,93,71};
int n =num.length;
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
System.out.println("("+num[i]+","+num[j]+")");
}
}
}
}

