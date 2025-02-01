package com.wipro.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.hibernate.entity.Employee;
import com.wipro.hibernate.util.HibernateUtil;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public Employee getEmployee(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }
}
