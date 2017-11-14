package be.cegeka.selfEval.domain.users;

import org.springframework.test.util.ReflectionTestUtils;

public class UserTestBuilder {

    private String name;
    private int id;

    public static UserTestBuilder aUser(){
        return new UserTestBuilder()
                .withName("Name");
    }

    public User build(){
        User user = new User(name);
        ReflectionTestUtils.setField(user, "id", id);
        return user;
    }

    public UserTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UserTestBuilder withId(int id){
        this.id = id;
        return this;
    }
}
