package com.crud.service;

import java.util.List;

import com.crud.model.Contact;

public interface ContactService {

    public void addContact(Contact contact);
 
    public List<Contact> getAllContacts();
 
    public void deleteContact(Integer contactId);
 
    public Contact getContact(int contactid);
 
    public Contact updateContact(Contact contact);
}

