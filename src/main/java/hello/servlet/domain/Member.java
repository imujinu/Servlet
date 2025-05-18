package hello.servlet.domain;

import lombok.Data;

@Data
public class Member {

    private Long id;
    private String userName;
    private int age;

    public Member(String userName, int age){
        this.userName =userName;
        this.age = age;

    }
}
