package session_6_java_core_apis.challenge;

//substring replacement
class Challenge6 {
    protected static StringBuilder substrigReplacer(){
        var sb = new StringBuilder("The cat sat on the mat");
        System.out.println("Challenge6-before substring replacement: "+sb);
        for(byte i=0;i<sb.length()-2;i++)
            if(sb.substring(i,i+3)=="cat") sb.replace(i,i+3,"dog");
        return sb;
    }
}
