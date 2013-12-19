package com.mp2srt.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Compte entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.mp2srt.hibernate.Compte
 * @author MyEclipse Persistence Tools
 */
public class CompteDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(CompteDAO.class);
	// property constants
	public static final String PASSWORD = "password";
	public static final String NOM = "nom";
	public static final String PRENOM = "prenom";
	public static final String TITRE = "titre";
	public static final String ADRESSE_MAIL = "adresseMail";
	public static final String MAILPASSWORD = "mailpassword";

	public void save(Compte transientInstance) {
		log.debug("saving Compte instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Compte persistentInstance) {
		log.debug("deleting Compte instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Compte findById(java.lang.String id) {
		log.debug("getting Compte instance with id: " + id);
		try {
			Compte instance = (Compte) getSession().get(
					"com.mp2srt.hibernate.Compte", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Compte instance) {
		log.debug("finding Compte instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mp2srt.hibernate.Compte")
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
		log.debug("finding Compte instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Compte as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByNom(Object nom) {
		return findByProperty(NOM, nom);
	}

	public List findByPrenom(Object prenom) {
		return findByProperty(PRENOM, prenom);
	}

	public List findByTitre(Object titre) {
		return findByProperty(TITRE, titre);
	}

	public List findByAdresseMail(Object adresseMail) {
		return findByProperty(ADRESSE_MAIL, adresseMail);
	}

	public List findByMailpassword(Object mailpassword) {
		return findByProperty(MAILPASSWORD, mailpassword);
	}

	public List findAll() {
		log.debug("finding all Compte instances");
		try {
			String queryString = "from Compte";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Compte merge(Compte detachedInstance) {
		log.debug("merging Compte instance");
		try {
			Compte result = (Compte) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Compte instance) {
		log.debug("attaching dirty Compte instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Compte instance) {
		log.debug("attaching clean Compte instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}