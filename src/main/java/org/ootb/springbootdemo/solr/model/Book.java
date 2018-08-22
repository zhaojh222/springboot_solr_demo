package org.ootb.springbootdemo.solr.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@SolrDocument(solrCoreName = "demo")
public class Book {

    @Id
    @Field
    private String id;

    @Field
    private List<String> cat;

    @Field
    private String name;

    @Field
    private boolean inStock;

    @Field
    private double price;

    @Field
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCat() {
        return cat;
    }

    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", cat='" + cat + '\'' +
                ", name='" + name + '\'' +
                ", inStock=" + inStock +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
