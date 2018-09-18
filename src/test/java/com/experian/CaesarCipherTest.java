package com.experian;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CaesarCipherTest {

    @Test
    public void testEncryptRotationOne(){

        CaesarCipher caesarCipher = new CaesarCipher();

        String encrypted = caesarCipher.encrypt(1,"dog");

        assertThat(encrypted, is("eph"));

    }

    @Test
    public void testEncryptRotationThirteen(){

        CaesarCipher caesarCipher = new CaesarCipher();

        String encrypted = caesarCipher.encrypt(13,"dog");

        assertThat(encrypted, is("qbt"));

    }


    @Test
    public void testEncryptSentence(){

        CaesarCipher caesarCipher = new CaesarCipher();

        String decryptedSentence = "Write a program that prints the numbers from 1 to 100. But for " +
                "multiples of three print \"Fizz\" instead of the number and for the multiples of " +
                "five print \"Buzz\". For numbers which are multiples of both three and five print \"FizzBuzz\".";

        String encryptedSentence = "dypal h wyvnyht aoha wypuaz aol ubtilyz myvt 1 av 100. " +
                "iba mvy tbsapwslz vm aoyll wypua \"mpgg\" puzalhk vm aol ubtily huk mvy aol tbsapwslz " +
                "vm mpcl wypua \"ibgg\". mvy ubtilyz dopjo hyl tbsapwslz vm ivao aoyll huk mpcl wypua \"mpggibgg\".";

        String encrypted = caesarCipher.encrypt(7,decryptedSentence);

        assertThat(encrypted, is(encryptedSentence));

    }

    @Test
    public void testDecryptRotationOne(){

        CaesarCipher caesarCipher = new CaesarCipher();

        String decrypted = caesarCipher.decrypt(1,"eph");

        assertThat(decrypted, is("dog"));

    }

    @Test
    public void testDecryptSentence(){

        CaesarCipher caesarCipher = new CaesarCipher();

        String encryptedSentence = "kvu'a wbzo tl 'jhbzl p't jsvzl av aol lknl p't ayfpun uva av svzl tf " +
                             "olhk pa'z sprl h qbunsl zvtlaptlz pa thrlz tl dvukly ovd p rllw myvt nvpu' bukly";

        String decryptedSentence = "don't push me 'cause i'm close to the edge i'm trying not to lose " +
                            "my head it's like a jungle sometimes it makes me wonder how i keep from goin' under";

        String decrypted = caesarCipher.decrypt(7,encryptedSentence);

        assertThat(decrypted, is(decryptedSentence));

    }

}
