public class string_compression {
    public static void main(String args[]){
        String str = "aaaabbbcddddeeeef";
        System.out.print(compressionString(str));
    }
    static String compressionString(String str){
        String compressString = "";
        for(int i =0;i<str.length();i++){
            Integer count = 1;
            char ch = str.charAt(i);
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            compressString += ch;
            if(count > 1){
                compressString += count;
            }
        }
        return compressString;
    }
}