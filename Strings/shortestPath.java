import java.lang.Math;
public class shortestPath{
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(getShortestPath(path));
    }
    static float getShortestPath(String str){
        int x =0, y =0;
        for(int i =0;i<str.length();i++){
            char dir = str.charAt(i);
            // East way
            if(dir == 'E'){
                x++;
            }else if(dir == 'W'){
                x--;
            }else if(dir == 'N'){
                y++;
            }else{y--;}
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2+Y2);
         
    }
}