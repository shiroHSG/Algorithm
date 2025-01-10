package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class UnfixedSlidingWindow {

    public static int maxLengthString(String str, int k) {
        if(str == null || str.length()==0 || k<=0) {
            return 0;
        }

        // 문자별 등장 횟수를 저장할 자료구조 (HashMap)
        Map<Character, Integer> charCountMap = new HashMap<>();

        int maxLen = 0;
        int left = 0;  // 슬라이딩 윈도우의 왼쪽 인덱스

        // right는 슬라이딩 윈도우의 오른쪽 인덱스
        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            // 오른쪽 문자 등장 횟수 갱신
            charCountMap.put(rightChar, charCountMap.getOrDefault(rightChar, 0) + 1);

            // 서로 다른 문자 종류의 개수가 k를 초과하면
            // 초과하지 않을 때까지 왼쪽 포인터를 이동하며 축소
            while (charCountMap.size() > k) {
                char leftChar = str.charAt(left);
                charCountMap.put(leftChar, charCountMap.get(leftChar) - 1);
                //0일 때 제거해주어야 map의 크기가 작아짐
                if (charCountMap.get(leftChar) == 0) {
                    charCountMap.remove(leftChar);
                }
                left++;
            }

            // 현재 윈도우가 조건(문자 종류 ≤ k)을 만족하는 시점에서 길이를 갱신
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String str = "aabcbbacccab";
        int k=2;



        System.out.println(maxLengthString(str, k));
    }
}