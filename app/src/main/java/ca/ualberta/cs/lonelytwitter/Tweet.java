package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet {
    String message;

    String message2;

    Date date;

    public void Tweet() {
        message = "";
        date = null;
    }

    public void setMessage(String tweetmessage){
        message = tweetmessage;
    }

    //overloading
    public void setMessage(String tweetmessage, String message2){
        message = tweetmessage;
        this.message2 = message2;

        System.out.println("second setMessage has been called");

    }


    public String getMessage(){
        return message;
    }

    @Override
    public String toString(){
        return message;
    }
}

