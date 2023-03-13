public class Human {
    public static void main(String[] args) {
        Human human = new Human("секрет", "новость", "опыт", "сплетни" );
        System.out.println(human.experience);
    }
    private final String secret; //секретики
    private final String news; //новости
    private final String experience; //опыт
    private final String gossip; //сплетни
    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }
    private String getSecret() {
        return secret;
    }
    public String getNews() {
        return news;
    }
    protected String getExperience() {
        return experience;
    }
    protected String getGossip() {
        return gossip;
    }
}