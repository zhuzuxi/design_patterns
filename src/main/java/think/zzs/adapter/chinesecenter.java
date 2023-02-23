package think.zzs.adapter;

public class chinesecenter extends player{

    private adapter transformer;

    public void setAdapter(adapter adapter){
        this.transformer = adapter;
    }

    public chinesecenter(String name, String duty,adapter transformer){
        super(name,duty);
        this.transformer = transformer;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", duty='" + duty;
    }

    @Override
    public void play_in_game() {
        transformer.transform(this.toString());
    }


}
