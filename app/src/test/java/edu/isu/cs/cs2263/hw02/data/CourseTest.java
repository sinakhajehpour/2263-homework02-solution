package edu.isu.cs.cs2263.hw02.data;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CourseTest {




    @Test
    void Course(){
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals(course,course);

    }

    @Test
    void getNumber() {
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals(2263,course.getNumber());

    }

    @Test
    void getCredits() {
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals(3,course.getCredits());

    }

    @Test
    void getCode() {
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals("CS",course.getCode());
        Course course1=new Course("Computer Science","CHEM",2263,3);
        assertEquals("CHEM",course1.getCode());
    }

    @Test
    void getName() {
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals("Computer Science",course.getName());
        Course course1=new Course("Chemistry","CS",2263,3);
        assertEquals("Chemistry",course1.getName());
        Course course2=new Course("Physics","CS",2263,3);
        assertEquals("Physics",course2.getName());

    }


    @Test
    void setCredits() {
        Course course=new Course("Computer Science","CS",2263,3);
        course.setCredits(4);
        assertEquals(4,course.getCredits());
    }

    @Test
    void setNumber() {
        Course course=new Course("Computer Science","CS",2263,3);
        course.setNumber(3301);
        assertEquals(3301,course.getNumber());
    }

    @Test
    void setName() {
        Course course=new Course("Computer Science","CS",2263,3);
        course.setName("Chemistry");
        assertEquals("Chemistry",course.getName());
    }

    @Test
    void setCode() {
        Course course=new Course("Computer Science","CS",2263,3);
        course.setCode("CHEM");
        assertEquals("CHEM",course.getCode());
        Course course1=new Course("Computer Science","CS",2263,3);
        course1.setCode("PHYS");
        assertEquals("PHYS",course1.getCode());
    }

    @Test
    void testToString() {
        Course course=new Course("Computer Science","CS",2263,3);
        assertEquals("CS 2263 Computer Science (3)",course.toString());

    }
}