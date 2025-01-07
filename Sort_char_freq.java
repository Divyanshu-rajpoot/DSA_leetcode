// import java.util.*;
// import java.util.stream.Collectors;

// public class Sort_char_freq {
//     public static void main(String[] args) {
//         String str = "aba0bea";
//         System.out.println(frequencySort(str));
//     }

//     public static String frequencySort(String s) {
//         StringBuilder str = new StringBuilder();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (!map.containsKey(ch)) {
//                 map.put(ch, 1);
//             } else {
//                 map.put(ch, map.get(ch) + 1);
//             }
//         }

//         HashMap<Character, Integer> temp = map.entrySet()
//                 .stream()
//                 .sorted((i1, i2) -> i1.getValue().compareTo(
//                         i2.getValue()))
//                 .collect(Collectors.toMap(
//                         Map.Entry::getKey,
//                         Map.Entry::getValue,
//                         (e1, e2) -> e1, LinkedHashMap::new));

//         for (Character ch: temp.keySet()) {
//             int val = temp.get(ch);
//             while (val-- > 0) {
//                 str.append(ch);
//             }
//         }
//         return str.reverse().toString();
//     }
// }

// import java.util.*;
// import java.util.stream.Collectors;

// public class Sort_char_freq {
//     public static void main(String[] args) {
//         String str = "aba0bea";
//         System.out.println(frequencySort(str));
//     }

//     public static String frequencySort(String s) {
//         StringBuilder str = new StringBuilder();
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (!map.containsKey(ch)) {
//                 map.put(ch, 1);
//             } else {
//                 map.put(ch, map.get(ch) + 1);
//             }
//         }

//         HashMap<Character, Integer> temp = map.entrySet()
//                 .stream()
//                 .sorted((i1, i2) -> i1.getValue().compareTo(
//                         i2.getValue()))
//                 .collect(Collectors.toMap(
//                         Map.Entry::getKey,
//                         Map.Entry::getValue,
//                         (e1, e2) -> e1, LinkedHashMap::new));

//         for (Character ch: temp.keySet()) {
//             int val = temp.get(ch);
//             while (val-- > 0) {
//                 str.append(ch);
//             }
//         }
//         return str.reverse().toString();
//     }
// }
