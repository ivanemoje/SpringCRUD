package com.crud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.crud.dao.ContactDao;
import com.crud.model.Contact;
 
@Service
@Transactional
public class ContactServiceImpl implements ContactService {
 
    @Autowired
    private ContactDao contactDao;
 
    @Override
    @Transactional
    public void addContact(Contact contact) {
        contactDao.addContact(contact);
    }
 
    @Override
    @Transactional
    public List<Contact> getAllContacts() {
        return contactDao.getAllContacts();
    }
 
    @Override
    @Transactional
    public void deleteContact(Integer contactId) {
        contactDao.deleteContact(contactId);
    }
 
    public Contact getContact(int contid) {
        return contactDao.getContact(contid);
    }
 
    public Contact updateContact(Contact contact) {
        // TODO Auto-generated method stub
        return contactDao.updateContact(contact);
    }
 
    public void setcontactDAO(ContactDao contactDAO) {
        this.contactDao = contactDAO;
    }
 
}
