public class largest_string{
    public static void main(String args[]){
        String fruits[] = {"banana","apple","guuuu"};
        System.out.print(getLargestString(fruits));
    }
    static String getLargestString(String fruits[]){
        String largest = fruits[0];
        for(int i = 0;i<fruits.length();i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
}