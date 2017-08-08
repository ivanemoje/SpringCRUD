package com.crud.dao;

import com.crud.model.Contact;

import java.util.List;

public interface ContactDao {
 
    public void addContact(Contact contact);
 
    public List<Contact> getAllContacts();
 
    public void deleteContact(Integer contactId);
 
    public Contact updateContact(Contact contact);
 
    public Contact getContact(int contactid);
}
