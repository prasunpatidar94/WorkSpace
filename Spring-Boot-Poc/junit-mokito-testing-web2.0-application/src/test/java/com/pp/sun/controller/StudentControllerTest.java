package com.pp.sun.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pp.sun.entity.Student;
import com.pp.sun.repository.StudentRepository;
import com.pp.sun.service.StudentServices;
import net.bytebuddy.agent.VirtualMachine;
import org.apache.catalina.connector.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentRestController.class)
 class StudentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    StudentServices studentServices;



    @Test
     void saveStudentTestSuccess() throws Exception {

        Optional<Student> student = Optional.of(new Student(0, "Shiv", "Mahakal"));
        Mockito.when(studentServices.saveStudent(student.get())).thenReturn(student.get());

       MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders
                        .post("/student/save")
                        .content(new ObjectMapper().writeValueAsString(student.get()))
                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON)

                ).andExpect(status().isOk()).andReturn();
//                .andExpect(MockMvcResultMatchers.jsonPath("$id").isNotEmpty());

        String strResult = mvcResult.getResponse().getContentAsString();
        Student student1 = new ObjectMapper().readValue(strResult, Student.class);

        System.out.println(strResult);
        Assertions.assertEquals("Shiv",student1.getName());



    }

}
