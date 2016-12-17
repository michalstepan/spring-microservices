package com.stepan.services.pokladna.service;

import com.stepan.services.pokladna.model.Receipt;

import java.util.List;

/**
 * Created by Michal on 17.12.2016.
 */
public interface ReceiptService {
    Receipt getById(Integer receiptId);

    Receipt simNewReceipt();

    List<Receipt> getReceiptsForIssuer(String issuer);
}
