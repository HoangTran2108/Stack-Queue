import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Xin chào"
                + "\n chào bạn"
                + "\n Xin chào Hoàng";
        System.out.println("Văn bản gồm: ");
        System.out.println(str);
        System.out.println("---------------------------------");

        System.out.println("Liệt kê số lần xuất hiện của các từ: ");
        Map<String, Integer> wordMap = CountText.countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }
}