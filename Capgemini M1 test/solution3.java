class Header{
    String sender,receiver;

    public Header(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }
}
class Email{
    Header header;
    String body,greetings;

    public Email(Header header, String body, String greetings) {
        this.header = header;
        this.body = body;
        this.greetings = greetings;
    }
}
class EmailImplementation{
    public int validateEmail(Email e){

        char s=e.header.toString().charAt(0);
        int val=0;
        int count=0;
        for (int i=0;i<e.header.toString().length();i++){
            if (e.header.toString().charAt(i)=='@'){
                count++;
            }
        }
        if(s>='A' && s<='Z' || s>='a' && s<='z' ||s=='_'){
            if(e.header.toString().endsWith(".")){
                if(count==1){
                   val++;
                }

            }
        }
        return val;
    }
    public String greetingMessage(Email e){
        String name=e.header.sender;
        int index=name.indexOf('@');
        String only_name=name.substring(0,index);
        String final_great=only_name.concat((e.greetings));
        return final_great;
    }

}
public class solution3 {
    public static void main(String[] args) {
        Header h=new Header("Ravi@gmail.com","1rab@gmail.com");
        Email e=new Email(h,"hi","thank you");
        EmailImplementation eop=new EmailImplementation();
        eop.greetingMessage(e);


    }

}
