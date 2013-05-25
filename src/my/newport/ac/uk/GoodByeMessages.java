package my.newport.ac.uk;

/**
 * Deals with good bye never give up messages. This is just a set of educative
 * and motivational messages that are printed when a user gets killed by a dragon
 * or when they quit before finishing the game. At the moment there are only 20
 * messages.
 *
 * @author Richard Chambula
 */
public class GoodByeMessages {
    private String[] messages = new String[20];
    public GoodByeMessages() {
        messages[0] = "Never, never, never give up.";
        messages[1] = "Never give up on your dream... because you never know what the Lord can bless you with.";
        messages[2] = "You just never give up, no matter how hard the challenges are, and observe this world with a healthy dose of criticism and don't just follow the herd like somebody else might do.";
        messages[3] = "Never give up, for that is just the place and time that the tide will turn.";
        messages[4] = "My parents taught me to never give up and to always believe that my future could be whatever I dreamt it to be.";
        messages[5] = "The reason I never give up hope is because everything is so basically hopeless.";
        messages[6] = "Never give up; for even rivers someday wash dams away.";
        messages[7] = "Don't ever give up. You gotta keep trying, and never give up.";
        messages[8] = "I'm very inspired by him-it was my father who taught us that an immigrant must work twice as hard as anybody else, that he must never give up.";
        messages[9] = "When you get into a tight place and everything goes against you, till it seems as though you could not hang on a minute longer, never give up then, for that is just the place and time that the tide will turn.";
        messages[10] = "Never give in and never give up.";
        messages[11] = "If you fall behind, run faster. Never give up, never surrender, and rise up against the odds.";
        messages[12] = "I ran and ran and ran every day, and I acquired this sense of determination, this sense of spirit that I would never, never give up, no matter what else happened.";
        messages[13] = "Never give up. And never, under any circumstances, face the facts.";
        messages[14] = "While we should never give up our principles, we must also realize that we cannot maintain our principles unless we survive.";
        messages[15] = "Never give up. You only get one life. Go for it!";
        messages[16] = "Freedom and democracy are dreams you never give up.";
        messages[17] = "I never give up. Doesn't matter what the score is.";
        messages[18] = "One thing that was passed on from generation to generation in my family, over seven generations in 200 years, was never give up. That's the way we live.";
        messages[19] = "I never give up on things.";
    }
    
    /**
     * Gets a good bye message when a player quits or gets defeated by the dragon.
     * @param index the number of the message to be returned. This is randomly generated
     * @return a good by message at a specified index position
     */
    public String getGoodByeMessage(int index){
        return messages[index];
    }
}
