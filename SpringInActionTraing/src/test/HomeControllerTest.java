import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.web.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest {
    @Test
    public void testHomePage()throws Exception{
        HomeController homeController = new HomeController();
        Assert.assertEquals("home",homeController.home());

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}
