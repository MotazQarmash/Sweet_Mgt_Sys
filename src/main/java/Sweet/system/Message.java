package Sweet.system;

public class Message {
    private final String senderEmail;
    private final String content;
    private final String receiverEmail;

    public Message(String senderEmail, String recieverEmail, String content) {
        this.senderEmail = senderEmail;
        this.content = content;
        this.receiverEmail = recieverEmail;
    }



    public String getSenderEmail() {
        return senderEmail;
    }

    public String getContent() {
        return content;
    }
public String getReceiverEmail(){
        return receiverEmail;
}


}