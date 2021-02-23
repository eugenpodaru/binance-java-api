package com.binance.api.client;

import com.binance.api.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Binance API error object.
 */
public class BinanceApiError {

    /**
     * Error code.
     */
    private int code;

    /**
     * Error message.
     */
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCodeAndMessage() {
        return String.format("[%s]:%s", code, message);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("code", code)
                .append("message", message)
                .toString();
    }
}
