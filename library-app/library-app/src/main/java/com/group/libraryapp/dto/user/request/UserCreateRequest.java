package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; // Ingeger => NULL 표시가능(int는 불가능)

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
