package org.ootb.springbootdemo.solr.repository;

import org.ootb.springbootdemo.solr.model.Book;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.data.solr.repository.SolrRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends SolrCrudRepository<Book,String> {

    List<Book> findBooksByAuthorContains(String author);
}
