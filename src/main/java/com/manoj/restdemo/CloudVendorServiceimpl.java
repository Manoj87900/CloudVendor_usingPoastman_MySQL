package com.manoj.restdemo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class CloudVendorServiceimpl implements CloudVendorService
{
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorServiceimpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		
		
		return cloudVendorRepository.findAll();
	}

}
