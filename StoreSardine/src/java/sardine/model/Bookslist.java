/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sardine.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SARUNSUMETPANICH
 */
@Entity
@Table(name = "BOOKSLIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bookslist.findAll", query = "SELECT b FROM Bookslist b")
    , @NamedQuery(name = "Bookslist.findByBookid", query = "SELECT b FROM Bookslist b WHERE b.bookid = :bookid")
    , @NamedQuery(name = "Bookslist.findByCategory", query = "SELECT b FROM Bookslist b WHERE b.category = :category")
    , @NamedQuery(name = "Bookslist.findByDescription", query = "SELECT b FROM Bookslist b WHERE b.description = :description")
    , @NamedQuery(name = "Bookslist.findByPrice", query = "SELECT b FROM Bookslist b WHERE b.price = :price")
    , @NamedQuery(name = "Bookslist.findByBookname", query = "SELECT b FROM Bookslist b WHERE b.bookname = :bookname")})
public class Bookslist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "BOOKID")
    private String bookid;
    @Size(max = 10)
    @Column(name = "CATEGORY")
    private String category;
    @Size(max = 30)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRICE")
    private double price;
    @Size(max = 50)
    @Column(name = "BOOKNAME")
    private String bookname;

    public Bookslist() {
    }

    public Bookslist(String bookid) {
        this.bookid = bookid;
    }

    public Bookslist(String bookid, double price) {
        this.bookid = bookid;
        this.price = price;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookslist)) {
            return false;
        }
        Bookslist other = (Bookslist) object;
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sardine.Servlet.Bookslist[ bookid=" + bookid + " ]";
    }
    
}
