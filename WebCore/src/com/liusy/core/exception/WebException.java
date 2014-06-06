package com.liusy.core.exception;

public class WebException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   public WebException() {
   }

   public WebException(String s) {
      super(s);
   }

   public WebException(Exception e) {
      super(e.getMessage());
   }
}
