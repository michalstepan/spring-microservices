package com.stepan.services.pokladna.service.impl;

import com.stepan.services.pokladna.model.Receipt;
import com.stepan.services.pokladna.repository.ReceiptRepository;
import com.stepan.services.pokladna.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Created by Michal on 17.12.2016.
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public Receipt getById(Integer receiptId) {
        return receiptRepository.findOne(receiptId);
    }

    @Override
    public Receipt simNewReceipt() {
        Receipt receipt = new Receipt();
        receipt.setIssuedBy("Michal");
        receipt.setPrice(BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble()));
        return receiptRepository.save(receipt);
    }

    @Override
    public List<Receipt> getReceiptsForIssuer(String issuer) {
        List<Receipt> receipts = receiptRepository.findAll();
        return receipts.stream()
                .filter(receipt -> receipt.getIssuedBy().equals(issuer))
                .collect(Collectors.toList());
    }


}
