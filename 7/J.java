import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        List<String> li = new ArrayList<>();
        for (String s:st.split("")) {
            li.add(s);
        }
        boolean ans = true;
        for (int i = 0; i < li.size(); i++) { //
            if (!li.get(i).equals(li.get(li.size()-i-1))) { //
                ans = false;
//                System.out.print(li.get(i) + li.get(li.size()-i-1));
            }
        }

        System.out.println(ans? "True":"False");
    }
}