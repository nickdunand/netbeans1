/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Nicholas
 */
public class BlogHelper {

    Session session = null;

    public BlogHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List getBlogEntries() {
        List<Blog> blogList = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Blog as blog");
            blogList = (List<Blog>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blogList;
    }
    public int addBlogEntry(String firstname, String surname) {
        try {
            // session = HibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            Blog b = new Blog(firstname, surname);
            session.save(b);
            tx.commit();
            return b.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

}
