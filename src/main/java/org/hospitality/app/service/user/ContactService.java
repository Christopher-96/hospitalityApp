package org.hospitality.app.service.user;

import org.hospitality.app.entity.user.Contact;
import org.hospitality.app.service.IService;
import java.util.Set;

public interface ContactService extends IService < Contact, String>{
    Set<Contact> getAll();

    Set<Contact> getAllStartingWithA();
}
