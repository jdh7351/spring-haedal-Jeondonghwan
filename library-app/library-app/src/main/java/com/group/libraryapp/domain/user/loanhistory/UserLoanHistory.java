package com.group.libraryapp.domain.user.loanhistory;

import com.group.libraryapp.domain.user.User;

import javax.persistence.*;

@Entity
public class UserLoanHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(nullable = false)
    @ManyToOne
    private User user;

    private String bookName;

    private boolean isReturn;

    protected UserLoanHistory() {}

    public UserLoanHistory(User user, String bookName)
    {
        this.user = user;
        this.bookName = bookName;
        this.isReturn = false;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getBookName() {
        return bookName;
    }

    public void doReturn() {
        this.isReturn = true;
    }
}
