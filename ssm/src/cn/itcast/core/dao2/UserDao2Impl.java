package cn.itcast.core.dao2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.itcast.core.pojo.User;
@Repository
public class UserDao2Impl implements UserDao2{
	@Autowired
	private HttpSolrServer solrServer;
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		
       SolrQuery solrQuery = new SolrQuery();
		
		solrQuery.setQuery("*:*");
       
		// 执行查询，并返回结果对象
		QueryResponse response = solrServer.query(solrQuery);
		
		SolrDocumentList documentList = response.getResults();
		List<User> list=new ArrayList<>();
		for (SolrDocument solrDocument : documentList) {
			User user =new User();
			 Integer id=Integer.parseInt(String.valueOf(solrDocument.get("id")));
			 String name = String.valueOf(solrDocument.get("name"));
			 Date birthday =(Date) solrDocument.get("birthday");
			 user.setBirthday(birthday);
			 user.setId(id);
			 user.setName(name);
			 list.add(user);
		}
		return list;
	}

}
