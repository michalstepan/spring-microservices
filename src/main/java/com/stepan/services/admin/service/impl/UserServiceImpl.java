package com.stepan.services.admin.service.impl;

import com.stepan.services.admin.model.User;
import com.stepan.services.admin.model.dto.ReceiptDTO;
import com.stepan.services.admin.repository.UserRepository;
import com.stepan.services.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static com.stepan.services.admin.AdminServer.POKLADNA_SERVICE_URL;

/**
 * Created by Michal on 17.12.2016.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @Override
    public User getById(Integer receiptId) {
        return userRepository.findOne(receiptId);
    }

    @Override
    public User simNewUser() {
        User user = new User();
        user.setName("Michal");
        user.setSurname("Stepan");
        return userRepository.save(user);
    }

    @Override
    public List<ReceiptDTO> getReceiptsForUser(Integer userId) {
        User user = userRepository.findOne(userId);
        return restTemplate.exchange(POKLADNA_SERVICE_URL + "/receipt/for/{userName}",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ReceiptDTO>>() {
                },
                user.getName())
                .getBody();
    }


}
