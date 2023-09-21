package com.manoj.restdemo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	
	//Read specific cloud vendor details from DB
	@GetMapping("{vendorId}")
	public CloudVendor getCloudvendordetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.getCloudVendor(vendorId);
	
	}
	
	//Read All cloud vendor details from DB
	@GetMapping()
	public List<CloudVendor> getAllCloudvendordetails() {
		
		return cloudVendorService.getAllCloudVendors();
	
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) 
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created Succesfully";	
		
	}
	
	@PutMapping
	public String updatecreateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) 
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated Succesfully";	
		
	}
	
	@DeleteMapping("{vendorId}")
	public String deletecreateCloudVendorDetails(@PathVariable("vendorId") String vendorId) 
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		return "Cloud Vendor Deleted Succesfully";	
		
	}

}
