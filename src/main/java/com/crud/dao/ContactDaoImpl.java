package com.crud.dao;


import java.util.List;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
import com.crud.model.Contact;
 
@Repository
public class ContactDaoImpl implements ContactDao {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Contact> getAllContacts() {
 
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    @Override
    public void deleteContact(Integer contactId) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, contactId);
        if (null != contact) {
            this.sessionFactory.getCurrentSession().delete(contact);
        }
 
    }
 
    public Contact getContact(int contid) {
        return (Contact) sessionFactory.getCurrentSession().get(
                Contact.class, contid);
    }
 
    @Override
    public Contact updateContact(Contact contact) {
        sessionFactory.getCurrentSession().update(contact);
        return contact;
    }
 
}