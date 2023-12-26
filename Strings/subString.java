public class subString{
    public static void main(String args[]){
        String str = "Hello sajal..";
        // inbuild function to print substring 
        // str.subString(str,0,3);
        System.out.print(printSubString(str,0,3));
    }
    static String printSubString(String str, int si, int ei){
        String subString = "";
        for(int i = si;i<ei;i++){
            subString += str.charAt(i);
        }
        return subString;
    }
}