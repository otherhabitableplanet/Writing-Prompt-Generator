import java.util.Random;
class PromptGenerator {
    static Random rand = new Random();
    protected static int tempUpperBound = 2;
    protected static int wordUpperBound = 9;
    protected String prompt;
    public static SentenceStructure[] templates = {new SentenceStructure("There once was a person who had a ", ", they were happy living in ", ", but "),
    new SentenceStructure("There once was a doctor whose daughter had a ", ", they barely scraped by, living in ", ", and all of a sudden they realized that "),
    new SentenceStructure("An old person lived alone on a beach. They loved only their ", ". Their life changed for the better when they suddenly moved to ", ". All of a sudden, they realized that ")};

    public static String getPrompt(){
        SentenceStructure template = templates[rand.nextInt(tempUpperBound)];
        String prompt = template.messagePt1 + template.getAdj(rand.nextInt(wordUpperBound)) + " " + template.getNoun(rand.nextInt(wordUpperBound)) + "" + template.messagePt2 + template.getPlace(rand.nextInt(wordUpperBound)) + " " + template.messagePt3 + template.getProblem(rand.nextInt(wordUpperBound)) + ".";
        return prompt;
    }
}
