import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate localDate = LocalDate.of(2016, a, b);
        answer = String.valueOf(localDate.getDayOfWeek()).substring(0, 3);
        return answer;
    }
}