package org.worldbuild.websockete.resource;

import org.worldbuild.websockete.model.User;
import org.worldbuild.websockete.model.UserResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @MessageMapping("/user")
    @SendTo("/topic/detail")
    public UserResponse getUser(User user) {
        return new UserResponse("Hi " + user.getName());
    }
}
