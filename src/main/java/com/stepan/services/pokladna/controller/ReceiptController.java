package com.stepan.services.pokladna.controller;

import com.stepan.services.pokladna.model.Receipt;
import com.stepan.services.pokladna.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Michal on 17.12.2016.
 */
@RestController
public class ReceiptController {

    @Autowired
    private ReceiptService receiptService;

    @ResponseBody
    @RequestMapping(value = "/receipt/{id}", method = RequestMethod.GET)
    public Receipt getReceiptById(@PathVariable(value = "id") Integer receiptId) {
        return receiptService.getById(receiptId);
    }

    @ResponseBody
    @RequestMapping(value = "/receipt/sim", method = RequestMethod.GET)
    public Receipt simNewReceipt() {
        return receiptService.simNewReceipt();
    }

    @ResponseBody
    @RequestMapping(value = "/receipt/for/{issuer}", method = RequestMethod.GET)
    public List<Receipt> getReceiptsForUser(@PathVariable(value = "issuer") String issuer) {
        return receiptService.getReceiptsForIssuer(issuer);
    }


}
