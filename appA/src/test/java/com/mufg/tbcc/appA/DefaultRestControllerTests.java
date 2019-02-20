package com.mufg.tbcc.appA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultRestControllerTests {

    @InjectMocks
    DefaultRestController defaultRestController;


//    @Mock
    MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(DefaultRestController.class).build();
        System.out.println("--------------------  setup");
    }

    @Test
    public void getStatus() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/status"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("OK"));
        System.out.println("--------------------  getStatus");
    }

    @After
    public void tearDown() {
        mockMvc = null;
        System.out.println("--------------------  tearDown");
    }

}

