public class stringTest {
    public static void main(String[] args) {
        String url =  "https://google.com?search=javarush&page=1&color=black";
        int index1 = url.indexOf("?");
        int index2 = url.indexOf("&");
        int index3 = url.indexOf(".",15);
        String paramOne = url.substring(index1 +1,index2);
        String paramTwo = url.substring(index2 +1,index3);
        System.out.println(paramOne + " " + paramTwo);

    }
}
