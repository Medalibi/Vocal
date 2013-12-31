package com.mp2srt.hibernate;

import java.util.Date;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for Email
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.mp2srt.hibernate.Email
 * @author MyEclipse Persistence Tools
 */
public class EmailDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(EmailDAO.class);
	// property constants
	public static final String SUJET = "sujet";
	public static final String SEND_ADRESSE = "sendAdresse";
	public static final String CONTENU = "contenu";
	public static final String COMPTE = "compte";

	public void save(Email transientInstance) {
		log.debug("saving Email instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Email persistentInstance) {
		log.debug("deleting Email instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Email findById(java.lang.Long id) {
		log.debug("getting Email instance with id: " + id);
		try {
			Email instance = (Email) getSession().get(
					"com.mp2srt.hibernate.Email", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Email instance) {
		log.debug("finding Email instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mp2srt.hibernate.Email")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Email instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Email as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCompte(Object sujet) {
		return findByProperty(COMPTE, sujet);
	}
	
	public List findBySujet(Object sujet) {
		return findByProperty(SUJET, sujet);
	}

	public List findBySendAdresse(Object sendAdresse) {
		return findByProperty(SEND_ADRESSE, sendAdresse);
	}

	public List findByContenu(Object contenu) {
		return findByProperty(CONTENU, contenu);
	}

	public List findAll() {
		log.debug("finding all Email instances");
		try {
			String queryString = "from Email";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Email merge(Email detachedInstance) {
		log.debug("merging Email instance");
		try {
			Email result = (Email) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Email instance) {
		log.debug("attaching dirty Email instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Email instance) {
		log.debug("attaching clean Email instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}