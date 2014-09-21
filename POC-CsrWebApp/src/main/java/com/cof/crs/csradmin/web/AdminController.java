package com.cof.crs.csradmin.web;

import java.net.URI;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriTemplate; 

import com.cof.crs.csradmin.model.Csr;

/**
 * A controller handling requests for CRUD operations for the CRS CSR Admin.
 */
@Controller 
public class AdminController 
{
	//	Return a Csr to be converted to JSON using Jackson jars and @ResponseBody.
	//	http://localhost:8080/crsCsrAdmin/csrAdminServlet/getCsr/1
	@RequestMapping(value = "/getCsr/{adminId}", method = RequestMethod.GET)
	public @ResponseBody Csr getCsr(@PathVariable("adminId")String id)
	{
		//TODO add logic to get Csr for id.
		return new Csr("Jonny", "Ringo", "1");
	}
}