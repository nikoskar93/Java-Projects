package projects;

import java.util.Scanner;

public class HammingDistanceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int hamming;

        System.out.println("Please insert two DNA strands to compare");
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        try {
            hamming = getHammingDistance(s1, s2);
            System.out.println("The hamming distance between the two DNA strands is: " + hamming);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The two strands should have the same length!");
        }
    }

    public static int getHammingDistance(String s1, String s2) {
        int hamming = 0;
        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();

        try {
            for (int i = 0; i < s1.length(); i++) {
            if (ch1[i] != ch2[i]) { hamming++; }
            }
        } catch (StringIndexOutOfBoundsException e) {
            throw e;
        }

        return hamming;
    }
}
