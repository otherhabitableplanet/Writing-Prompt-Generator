public class SentenceStructure {
    protected String messagePt1;
    protected String messagePt2;
    protected String messagePt3;
    protected String item;

    // Fork, dish, goat, dove, man, child, boat, ship, ambulance, water bottle
    protected String[] nouns = {"fork", "dish", "goat", "dove", "man", "child", "boat", "ship", "ambulance", "water bottle"};

    // Good, new, first, last, long, great, little, old, bad, big
    protected String[] adjectives = {"good", "new", "first", "last", "long", "great", "little", "old", "bad", "big"};

    protected String[] problems = {"they forgot their wallet", "they can't seem to find their son", "they are rich but lonely", "they are talented but no one sees it", "they are sad but must pretend to be happy", "they are in love and can't show it", "they have to go to war", "they are the chosen one to save the world", "they are the president of the United States", "they have an addiction to reading"};

    protected String[] places = {"downtown Toronto", "the middle of the Sahara Desert", "the moon", "a magical forest", "a small apartment", "a huge mansion", "an old cave system", "a suburban home", "a spaceship orbiting mars", "a giant treehouse"};

    public SentenceStructure(String message1, String message2, String message3){
        this.messagePt1 = message1;
        this.messagePt2 = message2;
        this.messagePt3 = message3;
    }

    public String getNoun(int index){
        item = nouns[index];
        return item;
    }

    public String getAdj(int index){
        item = adjectives[index];
        return item;
    }

    public String getProblem(int index){
        item = problems[index];
        return item;
    }

    public String getPlace(int index){
        item = places[index];
        return item;
    }

}
