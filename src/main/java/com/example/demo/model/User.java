package com.example.demo.model;

import lombok.*;
@Data
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User implements Comparable<User>{

    private int score;

    private int age;

    public User(int score, int age){
        super();
        this.score = score;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int i = this.getAge() - o.getAge();//先按照年龄排序
        if(i == 0){
            return this.score - o.getScore();//如果年龄相等了再用分数进行排序
        }
        return i;
    }
}

