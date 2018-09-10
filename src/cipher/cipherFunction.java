package cipher;

import cipher.cipherForm;
import javax.swing.JFrame;
/**
 *
 * @author Armaan
 */
class cipherFunction{
    
    //Generating unique key through sum of all characters ASCII value
    //preNum to make it random.
    int keyGenerator(String key){
        int preNum;
        int keySum=0;
        StringBuffer ksb = new StringBuffer(key); 
        for(int i=0;i<ksb.length();i++){
            int keyTmp = (int)ksb.charAt(i); 
            keySum+=keyTmp;
        }
        preNum = (keySum%23)*75;
        return preNum;
    }
    
    protected String encrypt(String s, String key){

        int keySum = keyGenerator(key);

        //Adding keySum to every character of string.
        StringBuffer sb = new StringBuffer(s);
        for(int i=0; i<sb.length();i++){
            int tmp=0;
            tmp = (int) sb.charAt(i);
            tmp+=keySum;
            sb.setCharAt(i, (char)tmp);
        } s= sb.toString();
        return s;
    }
    
    protected String decrypt(String s, String key){

        int keySum = keyGenerator(key);
        
        //Adding keySum to every character of string.
        StringBuffer sb = new StringBuffer(s);
        for(int i=0; i<sb.length();i++){
            int tmp=0;
            tmp = (int) sb.charAt(i);
            tmp-=keySum;
            sb.setCharAt(i, (char)tmp);
        } s= sb.toString();
        return s;
    }
    
}
