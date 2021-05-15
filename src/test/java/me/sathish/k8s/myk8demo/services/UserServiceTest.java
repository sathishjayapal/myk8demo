package me.sathish.k8s.myk8demo.services;

import me.sathish.k8s.myk8demo.controller.UserController;
import me.sathish.k8s.myk8demo.data.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
class UserServiceTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserService userService;
    private List<User> userList;

    @BeforeEach
    public void setUp() {
        userList = Arrays.asList(new User("Sathish", "Kumar", BigDecimal.valueOf(1L), "user1", "secret"),
                new User("Bittu", "singh", BigDecimal.valueOf(2L), "user2", "supersecret"));
        when(userService.getAllUsers()).thenReturn(userList);
    }

    @Test
    @Tag("Passing")
    void getAllUsers() throws Exception {
        this.mockMvc.perform(get("/api/allusers")).andExpect(status().isOk());
    }
}
