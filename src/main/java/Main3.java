//*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.

public class Main3 {
    public static void main(String[] args) {
        String str = "abc";
        str = str.repeat(10_000);


        StringBuilder stringBuilder = new StringBuilder(str);


        long start = System.currentTimeMillis();
        str = str.replace("a", "A");
        System.out.println("String result: " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == 'a'){
                stringBuilder.replace(i,i+1,"A");
            }
        }
        System.out.println("StringBuilder result: " + (System.currentTimeMillis() - start));
    }
}
