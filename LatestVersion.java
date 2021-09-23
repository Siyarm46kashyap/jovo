public class LatestVersion {
    public static void main(String[] args) {
        Double[] arr = {1.01,1.001341,1.09,1.01941,2.00001};
        Double max=0.0;
        for(int i=0;i<5;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println(max);
    }
}
