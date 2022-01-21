package com.moregorenine.swaggerui.event;

import com.moregorenine.swaggerui.domain.entity.User;
import com.moregorenine.swaggerui.repository.UserRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InitData {

    private final UserRepository userRepository;

    public InitData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void save() {
        this.userRepository.save(new User("moregorenine", "moregorenine@gmail.com", "test123"));
    }
}
