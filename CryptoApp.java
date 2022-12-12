package projetcs;

import java.security.Key;

public class CryptoApp {

    public static void main(String[] args) {
        String s = "JULIUS CAESAR";
        final int KEY = 3;

        String encrypted = encrypt(s, KEY);
        System.out.println(encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.println(decrypted);

    }

    public static String encrypt(String s, int key) {
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                encrypted.append(cipher(ch, key));
            } else {
                encrypted.append(ch);
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                decrypted.append(decipher(ch, key));
            } else {
                decrypted.append(ch);
            }
        }

        return decrypted.toString();
    }

    public static char cipher(char ch, int key) {
        int message, cipher;

        message = ch - 65;
        cipher = (message + key) % 26;

        return (char) (cipher + 65);
    }

    public static char decipher(int ch, int key) {
        int message, cipher;

        cipher = ch - 65;
        message = ((cipher - key) + 26) % 26;

        return (char) (message + 65);
    }
}
