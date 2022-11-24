package com.ug11.instapost;

public class EmailException extends Exception{
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode){
        super();
        this.errorCode = errorCode;
        if (errorCode == 1){
            this.errorMessage = "Error: Login gagal! Email yang Anda masukkan tidak valid.";
        } else if (errorCode == 2) {
          this.errorMessage = "Error: Login gagal! Email Anda tidak terdaftar di Google";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
