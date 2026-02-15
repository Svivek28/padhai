package out.vivek.patterns;

public class stream {
    public static void main(String[] args) {
        System.out.println(skip("","baccad"));
    }
    static String skip(String p, String up)
    {
    if(up.isEmpty()){
        return p;
        //return;
    }
    char ch=up.charAt(0);
    if(ch=='a'){
        return skip(p, up.substring(1));
    }
    else{
        return skip(p+ch, up.substring(1));
    }
}
}
