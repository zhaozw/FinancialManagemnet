package com.graduationproject.personnalfinancialmanagement.customerservice.trainTicket.javabean;

import java.io.Serializable;

/**
 * Created by longhui on 2016/5/25.
 */
public class TrainPriceSum implements Serializable {
    private String reason;
    private TrainPrice result;
    private String error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public TrainPrice getResult() {
        return result;
    }

    public void setResult(TrainPrice result) {
        this.result = result;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }
}
