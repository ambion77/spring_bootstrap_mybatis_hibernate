/**
 * 
 */
package com.summitworks.mappers;

import java.util.List;

import com.summitworks.model.Contact;

public interface ContactMapper {
	List<Contact> selectContactList(String test);
}
