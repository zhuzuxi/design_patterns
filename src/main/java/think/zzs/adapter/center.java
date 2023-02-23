package think.zzs.adapter;

public class center extends player{

    public center(String name, String duty){
        super(name,duty);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", duty='" + duty;
    }

    @Override
    public void play_in_game() {
        System.out.println(this);
    }


}
