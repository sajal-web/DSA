import java.util.*;
public class Maximum{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(6);
        int  maxVal = Integer.MIN_VALUE;
        for(int i = 0;i< list.size();i++){
            // maxVal = Math.max(maxVal,list.get(i));
            if(maxVal < list.get(i)){
                maxVal = list.get(i);
            }
        }
        System.out.print("The max value of the list is : "+maxVal);
    }
}