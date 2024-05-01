public class ArrayDelete {

    static int accessElement(int arr[],int n,int element){
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    static int removeElement(int arr[],int n,int element){
        int pos=accessElement(arr,n,element);

        if(pos == -1){
            System.out.println("Element not Found!");
            return -1;
        }

        else{
            for(int i=pos;i<n-1 ;i++){
                arr[i]=arr[i+1];
            }

            return n - 1;
        }
    }

    public static void main(String[] args) {
         int arr[]={10,50,30,40,20};
         int n=arr.length;
         int element=40;

        System.out.println("Before Removing: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        n=removeElement(arr,n,element);
        System.out.println("After Removing: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
