package cn.itcast.core.dao2;

import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.stereotype.Repository;

import cn.itcast.core.pojo.User;

public interface UserDao2 {
	public List<User> getAll() throws Exception;
}
