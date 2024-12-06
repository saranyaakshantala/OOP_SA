package Examples;

public class as3_team {

    private String nickname;
    private String city;
    private String division;

    private String wins;
    private String losses;
    private String medals;

    public as3_team(String n, String c, String d, String w, String l, String m){
        nickname = n;
        city = c;
        division = d;
        wins = w;
        losses = l;
        medals = m;
    }

    public void printMe(){
        System.out.println("nickname: " + nickname + ", " + "city: " + city + ", " + "division: " + division + ", " + "wins " + wins + ", " + "losses " + losses + ", " + "medals " + medals );
    }


}
