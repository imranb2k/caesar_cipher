package com.experian;


public class CaesarCipher {

    private static final int UNICODE_LOWERCASE_A = 97;
    private static final int UNICODE_LOWERCASE_Z = 122;



    public String encrypt(int rotation, String word) {

        String encrypted = "";

        for (int i = 0; i < word.length(); i++) {

            int charNum = Character.toLowerCase(word.charAt(i));
            int encryptedRotation = charNum + rotation;

            if (encryptedRotation > UNICODE_LOWERCASE_Z) {

                int resetCharNum = (encryptedRotation - 1) - UNICODE_LOWERCASE_Z;
                encrypted += Character.toString((char) (UNICODE_LOWERCASE_A + resetCharNum));

            } else if (charNum < 65 || (charNum > 90 & charNum < 97 ) || charNum > 122) {

                encrypted += Character.toString((char) (charNum));

            } else {

                encrypted += Character.toString((char) (encryptedRotation));

            }

        }

        return encrypted;
    }



    public String decrypt(int rotation, String word) {

        String decrypted = "";

        for (int i = 0; i < word.length(); i++) {

            int charNum = Character.toLowerCase(word.charAt(i));
            int decryptedRotation = charNum - rotation;

            if (decryptedRotation < UNICODE_LOWERCASE_A) {

                //int resetCharNum = (decryptedRotation - 1) - UNICODE_LOWERCASE_Z;
                decrypted += Character.toString((char) (UNICODE_LOWERCASE_Z - rotation));

            } else if (charNum < 65 || (charNum > 90 & charNum < 97 ) || charNum > 122) {

                decrypted += Character.toString((char) (charNum));

            } else {

                decrypted += Character.toString((char) (decryptedRotation));

            }

        }

        return decrypted;
    }

}
