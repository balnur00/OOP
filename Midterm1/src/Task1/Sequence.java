package Task1;

public class Sequence {
    private String seq;

    public Sequence(String seq){
        this.seq = seq;
    }
    public String getSeq(){
        return seq;
    }
    public void setSeq(String s){
        seq = s;
    }
    public boolean isPal(){
        int l = seq.length();
        for (int i = 0; i < l; i++) {
            boolean bool =
            if(seq.charAt(i) == seq.charAt(l - i - 1))
                return true;
        }
        return false;
    }

    public boolean isSubStr(Sequence s){
        if(seq.contains( s.seq))
            return true;
        return false;
    }
}
