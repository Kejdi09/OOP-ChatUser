public class ChatUser {
    private String nickname, location;
    private int age;
    private static int number = 1;

    ChatUser(){
        nickname = "Anonymous" + number++;
        age = 20;
        location = "U.S.A";
        System.out.println("User " + nickname + " age:" + age +" location: " + location + " joined the chat.");
    }

    ChatUser(int age){
        nickname = "Anonymous" + number++;
        this.age = age;
        location = "U.S.A";
        System.out.println("User " + nickname + " age:" + age +" location: " + location + " joined the chat.");
    }

    ChatUser(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
        location = "U.S.A";
        System.out.println("User " + nickname + " age:" + age +" location: " + location + " joined the chat.");
    }

    ChatUser(String nickname, int age, String location){
        this.nickname = nickname;
        this.age = age;
        this.location = location;
        System.out.println("User " + nickname + " age:" + age +" location: " + location + " joined the chat.");
    }

    public String getNickname(){
        return nickname;
    }

    public String getLocation(){
        return location;
    }

    public int getAge(){
        return age;
    }

    public void setLocation(String Location){
        this.location = location;
    }

    public void printStatus(){
        System.out.println("User " + nickname + " age: " + age +" location: " + location + " is the chat.");
    }
}
