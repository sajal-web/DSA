public class arrayAs_function_argument{
    public static void main(String args[]){
        // String name[] = {"Batora","Luchi","Coce","Frooti"};
        // String key = "Frooti";
        int number[] = {12,23,34,45,56,67,78,89};
        int key = 56;
        System.out.print(findNumber
        
        (number,key));
    }
    static String linearSearch(String name[],String key){
        for(int i =0; i<name.length;i++){
            if(name[i] == key){
                return name[i];
            }
        }
        return "null";
    }
    static int findNumber(int number[], int key){
        for(int i =0;i < number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
}