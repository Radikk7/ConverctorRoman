import java.util.HashMap;

public class ConvectorRoman {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000
        HashMap<Character,Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I',1);
        romanNumbers.put('V',5);
        romanNumbers.put('X',10);
        romanNumbers.put('L',50);
        romanNumbers.put('C',100);
        romanNumbers.put('D',500);
        romanNumbers.put('M',1000);
        int result = 0;
        int previous = 0;

        for (int i =s.length()-1;i >=0;i--){
            int nowNumber = romanNumbers.get(s.charAt(i));
            if (nowNumber <  previous){
                result += -nowNumber;
            }
            else {
                result += nowNumber;
            }
            previous = nowNumber;
        }
        return result;
    }

}
