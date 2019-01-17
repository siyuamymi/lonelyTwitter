package ca.ualberta.cs.lonelytwitter;

public class importantTweet extends Tweet{

    public void importantTweet(String message){

        this.message = message;
    }

    public void setMessage(String firstMessage, String secondMessage){

        message = firstMessage;
        message2 = secondMessage;
    }

    public String getSomething(){
        return null;
    }

    public int isImportant(){return 1;}
}
