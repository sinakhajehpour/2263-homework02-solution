package edu.isu.cs.cs2263.hw02.data;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseLombock {

    private @Getter @Setter String firstName;
    private String lastName;
    private int age;




    public static void main(String[] args) {
        CourseLombock c=new CourseLombock();
        System.out.println(c.firstName);

    }

}
