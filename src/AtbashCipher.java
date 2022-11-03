public class AtbashCipher {


    public AtbashCipher(){}

    public String crypt(String in){
        String out="";
        char cur;
        for (int i=0;i<in.length();i++){
            cur = in.charAt(i);
            if(cur>='A' && cur<='Z'){
                if(cur<='M'){cur=(char)('['-(cur-'@'));}
                else{cur=(char)('@'-(cur-'['));}
                out+=cur;
            }
            else if(cur>='a' && cur<='z'){
                if(cur<='m'){cur=(char)('{'-(cur-'`'));}
                else{cur=(char)('`'-(cur-'{'));}
                out+=cur;
            }
            else {out+=cur;}

        }
        return out;
    }
}
