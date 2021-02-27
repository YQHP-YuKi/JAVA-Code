package Leetcode;

/**
 * Created by YQHP-YuKi.
 *
 * @author <a href="http://iamyqhp.com/">米拉桑</a>
 * @date 2021/01/17 18:05
 */
class Solution {
    public String maximumTime(String time) {
        StringBuilder strBuilder = new StringBuilder(time);
        String str;
        str = time.substring(0, 2);
        if (str == "??") {
            strBuilder.setCharAt(0, '2');
            strBuilder.setCharAt(1, '3');
        } else if (str == "0?" || str == "1?") {
            strBuilder.setCharAt(1, '9');
        } else if (str == "2?") {
            strBuilder.setCharAt(1, '3');
        } else if (str == "?0" || str == "?1" || str == "?2" || str == "?3") {
            strBuilder.setCharAt(0, '2');
        } else if (str == "?4" || str == "?5" || str == "?6" || str == "?7" || str == "?8" || str == "?9") {
            strBuilder.setCharAt(0, '1');
        }
        time = strBuilder.toString();
        str = time.substring(3, 5);
        if (str == "??") {
            strBuilder.setCharAt(3, '5');
            strBuilder.setCharAt(4, '9');
        } else if (str == "?0" || str == "?1" || str == "?2" || str == "?3" || str == "?4" || str == "?5" || str == "?6" || str == "?7" || str == "?8" || str == "?9") {
            strBuilder.setCharAt(3, '5');
        } else if (str == "0?" || str == "1?" || str == "2?" || str == "3?" || str == "4?" || str == "5?") {
            strBuilder.setCharAt(4, '9');
        }
        time = strBuilder.toString();
        return time;
    }
}