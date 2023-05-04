package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioMapMinhaRes {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        //Primeiro modo:
        // List<Integer> intMap = nums.stream()
        // .map(Integer::toBinaryString)
        // .map(val -> new StringBuilder(val).reverse().toString())
        // .map(val -> Integer.parseInt(val, 2))
        // .collect(Collectors.toList());
        
        //Segundo modo:
        // List<Integer> intMap = nums.stream()
        //     .map(val -> Integer.toBinaryString(val))
        //     .map(val -> new StringBuilder(val).reverse().toString())
        //     .map(val -> Integer.parseInt(val, 2))
        //     .collect(Collectors.toList());

        //Terceiro modo:
        List<Integer> intMap = nums.stream().map(val -> {
            String elem = new StringBuilder(Integer.toBinaryString(val)).reverse().toString();
            Integer finalElem = Integer.parseInt(elem, 2);
            return finalElem;
        }).collect(Collectors.toList());

        //System.out.println(String.join(", ", intMap)); 
        //System.out.println(intMap);

        for (Integer Bnum : intMap) {
             System.out.print(Bnum + " ");
        }


    }
}
