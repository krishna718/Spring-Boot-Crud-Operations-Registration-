package com.example.springregister;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class BasicErrorController extends RuntimeException {

	  public BasicErrorController(String exception) {
	    super(exception);
	  }

	}
