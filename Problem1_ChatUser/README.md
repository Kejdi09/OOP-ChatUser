# Exercise 1 – ChatUser 
## Project Overview

This project implements a ChatUser class to model users in an online chat system. Each user has private attributes for their nickname, age, and location. The class supports multiple constructors to create users with varying levels of initial information, including automatic generation of unique anonymous nicknames. This simulates real-world chat systems where some users may not provide a username upfront.

## Features

###### Encapsulation:
All attributes (nickname, age, location) are private to maintain data integrity.

###### Multiple Constructors:

- No-argument constructor creates a user with a unique nickname like Anonymous1, default age 20, and location U.S.A.

- Constructor with age parameter creates an anonymous user with the specified age.

- Constructor with nickname and age allows custom nicknames, default location U.S.A.

- Constructor with nickname, age, and location for full customization.

- Automatic Nickname Generation: Anonymous nicknames increment automatically to avoid duplicates.

###### Accessor Methods: 
Getters for all attributes and a setter only for location.

###### User Status Display: 
printStatus() method prints current user information in a user-friendly format.

## Usage

To use this class, instantiate ChatUser objects with the desired constructor, update locations if needed, and display their status. The constructors automatically print join messages upon creation.

#### Example:
````
public class TestChatUser {
    public static void main(String[] args) {
        ChatUser u1 = new ChatUser("JonathanD", 31);
        ChatUser u2 = new ChatUser();
        ChatUser u3 = new ChatUser("Antonette", 24, "France");
        ChatUser u4 = new ChatUser(36);

        u1.setLocation("Canada");
        u2.setLocation("Japan");

        u1.printStatus();
        u2.printStatus();
        u3.printStatus();
        u4.printStatus();
    }
}
````
#### Sample Output:
````
User JonathanD age:31 location: U.S.A joined the chat.
User Anonymous1 age:20 location: U.S.A joined the chat.
User Antonette age:24 location: France joined the chat.
User Anonymous2 age:36 location: U.S.A joined the chat.
User JonathanD age:31 location: Canada is in the chat.
User Anonymous1 age:20 location: Japan is in the chat.
User Antonette age:24 location: France is in the chat.
User Anonymous2 age:36 location: U.S.A is in the chat.
````