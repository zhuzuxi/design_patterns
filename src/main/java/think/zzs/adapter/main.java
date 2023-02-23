package think.zzs.adapter;

public class main {
    public static void main(String[] args) {
        player guard=new Guard("ouwen","goal and pass");
        player striker=new striker("詹姆斯","goal and pass");
        player ym=new chinesecenter("姚明","goal and defend",new adapter("yqq"));

        guard.play_in_game();
        striker.play_in_game();
        ym.play_in_game();
    }
}
