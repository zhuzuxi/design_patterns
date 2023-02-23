package think.zzs.adapter;

public class adapter {

    String name;

    public adapter(String name) {
        this.name = name;
    }

    public void transform(String str){
        System.out.println(this.name+"to ym  "+"中文:"+str);
    }
}
