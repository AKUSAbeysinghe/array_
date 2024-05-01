public class ArraySearch {

    static int accessElement(int arr[],int n,int element){
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                return i;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int arr[]={24,68,20,12,80};
        int n=arr.length;
        int element =80;

        int position = accessElement(arr,n,element) ;

        if(position==-1){
            System.out.println("Element Not Found!");

        }
        else{
            System.out.println("Element Found at position: "+(position+1));
        }
    }
}
