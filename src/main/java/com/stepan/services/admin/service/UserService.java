package com.stepan.services.admin.service;

import com.stepan.services.admin.model.User;
import com.stepan.services.admin.model.dto.ReceiptDTO;

import java.util.List;

/**
 * Created by Michal on 17.12.2016.
 */
public interface UserService {
    User getById(Integer receiptId);

    User simNewUser();

    List<ReceiptDTO> getReceiptsForUser(Integer userId);
}
