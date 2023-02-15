import java.util.ArrayList;

public class CumSum {
    public static void main(String[] args) {
        int[] arr=new int[]{25,35,12,4,36,48};
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
                sum+=arr[i];
                list.add(sum);
        }
        System.out.println(list);
    }
}
