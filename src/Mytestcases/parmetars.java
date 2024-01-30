package Mytestcases;

import java.util.Random;

public class parmetars {
	Random rand =new Random();
	String [] firstNames = {"Zain","Sara","Alaa","malek","AbdElhai"};
	String[] secandnAs ={"abd","Mohmmad","Ali","Ammad","alaa"};
	String passwords1="800562Ss*";
    int randomindx =rand.nextInt(4);
    int randomemailindx2=rand.nextInt(9999);
	String emailID =firstNames[randomindx]+secandnAs[randomindx]+randomemailindx2+"@"+"gmail.com";
	
	

}
