package com.mp2srt.hibernate;

import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Vocabulaire entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.mp2srt.hibernate.Vocabulaire
 * @author MyEclipse Persistence Tools
 */
public class VocabulaireDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(VocabulaireDAO.class);
	// property constants
	public static final String NOM_VOCAB = "nomVocab";

	public void save(Vocabulaire transientInstance) {
		log.debug("saving Vocabulaire instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vocabulaire persistentInstance) {
		log.debug("deleting Vocabulaire instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vocabulaire findById(java.lang.Long id) {
		log.debug("getting Vocabulaire instance with id: " + id);
		try {
			Vocabulaire instance = (Vocabulaire) getSession().get(
					"com.mp2srt.hibernate.Vocabulaire", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vocabulaire instance) {
		log.debug("finding Vocabulaire instance by example");
		try {
			List results = getSession()
					.createCriteria("com.mp2srt.hibernate.Vocabulaire")
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
		log.debug("finding Vocabulaire instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Vocabulaire as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNomVocab(Object nomVocab) {
		return findByProperty(NOM_VOCAB, nomVocab);
	}

	public List findAll() {
		log.debug("finding all Vocabulaire instances");
		try {
			String queryString = "from Vocabulaire";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Vocabulaire merge(Vocabulaire detachedInstance) {
		log.debug("merging Vocabulaire instance");
		try {
			Vocabulaire result = (Vocabulaire) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vocabulaire instance) {
		log.debug("attaching dirty Vocabulaire instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vocabulaire instance) {
		log.debug("attaching clean Vocabulaire instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}