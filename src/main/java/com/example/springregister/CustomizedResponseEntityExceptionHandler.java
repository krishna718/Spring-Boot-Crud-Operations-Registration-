package com.example.springregister;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

 
	  
	  @ControllerAdvice
	  @RestController
	  public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

		  @ExceptionHandler(Exception.class)
		  public final ResponseEntity<ErrorMessage> SomethingWentWrong(Exception ex, WebRequest request) {
			  ErrorMessage errormessage = new ErrorMessage(new Date(), ex.getMessage(),
		        "What is needed further");
		   
		    return new ResponseEntity<ErrorMessage>(errormessage,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		  }
	  }
	  
	  class ErrorMessage {
		  private Date timestamp;
		  private String message;
		  private String details;

		  public ErrorMessage(Date timestamp, String message, String details) {
		    super();
		    this.timestamp = timestamp;
		    this.message = message;
		    this.details = details;
		  }

		public Date getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		  
		  
}
