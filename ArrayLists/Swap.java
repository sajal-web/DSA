import java.util.*;
public class Swap{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(6);
        swapElements(list,2,3);
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
    }
   public static void  swapElements(ArrayList<Integer> list,int indx1,int indx2){
        int temp = list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
    }
}