package P524;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 题目 --> 通过删除字母匹配到字典里最长单词
// 通过二进制移位操作来生成 s字符串所能产生的所有子字符串，子字符串中字母的顺序和原字符串相同 (共有 2 的 n 次个子串)
public class Solution {
    public String findLongestWord(String s, List<String> d) {
        HashSet<String> set = new HashSet<>(d);
        List<String> list = new ArrayList<>();
        for(int i=0;i<(1<<s.length());i++){ // 1 << s.length() == 2 ^ s.length()   i 的 取值 涵盖了 左右子串的情况 001 010 ...
            StringBuilder t = new StringBuilder();
            for(int j=0;j<s.length();j++){
                if( (( i >> j ) & 1) != 0 ){ // 右移 j 位不等于0说明从右往左数第j位是 1，
                    t.append(s.charAt(j));
                }
            }
            list.add(t.toString());
        }
        String max_str = "";
        for (String str : list) {
            if (set.contains(str)) {
                if(str.length() > max_str.length() || ( str.length() == max_str.length() && str.compareTo(max_str) < 0 )){
                    max_str = str;
                }
            }
        }
        return max_str;
    }
}
