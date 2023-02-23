package think.zzs.adapter;

public abstract class player {
    String name;
    String duty;

    public player(String name, String duty){
        this.name = name;
        this.duty = duty;
    }

    public abstract void  play_in_game();


}
