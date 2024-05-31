package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HierarchyController {
	@Autowired
	public HierarchyServiceImpl hierarchyImpl;

	@GetMapping("/getOrgDetails")
	public List<OrganizationDTO> getOrganizationsDetails(){
		return hierarchyImpl.getOrganizationsDetails();
		
	}
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	}

		catch (SQLException | ClassNotFoundException e) { 
            // handle the SQL exception 
            handleSQLException(e); 
	}

}