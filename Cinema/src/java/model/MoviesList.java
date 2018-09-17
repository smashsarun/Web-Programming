/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SARUNSUMETPANICH
 */
@Entity
@Table(name = "MOVIES_LIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MoviesList.findAll", query = "SELECT m FROM MoviesList m")
    , @NamedQuery(name = "MoviesList.findByMovieid", query = "SELECT m FROM MoviesList m WHERE m.movieid = :movieid")
    , @NamedQuery(name = "MoviesList.findByMoviename", query = "SELECT m FROM MoviesList m WHERE m.moviename = :moviename")
    , @NamedQuery(name = "MoviesList.findByCategory", query = "SELECT m FROM MoviesList m WHERE m.category = :category")
    , @NamedQuery(name = "MoviesList.findByDescription", query = "SELECT m FROM MoviesList m WHERE m.description = :description")
    , @NamedQuery(name = "MoviesList.findByBranch", query = "SELECT m FROM MoviesList m WHERE m.branch = :branch")
    , @NamedQuery(name = "MoviesList.findByShowtime", query = "SELECT m FROM MoviesList m WHERE m.showtime = :showtime")
    , @NamedQuery(name = "MoviesList.findByDate", query = "SELECT m FROM MoviesList m WHERE m.date = :date")
    , @NamedQuery(name = "MoviesList.findByTheater", query = "SELECT m FROM MoviesList m WHERE m.theater = :theater")})
public class MoviesList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MOVIEID")
    private String movieid;
    @Size(max = 100)
    @Column(name = "MOVIENAME")
    private String moviename;
    @Size(max = 100)
    @Column(name = "CATEGORY")
    private String category;
    @Size(max = 200)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 200)
    @Column(name = "BRANCH")
    private String branch;
    @Column(name = "SHOWTIME")
    @Temporal(TemporalType.TIME)
    private Date showtime;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 100)
    @Column(name = "THEATER")
    private String theater;

    public MoviesList() {
    }

    public MoviesList(String movieid) {
        this.movieid = movieid;
    }

    public String getMovieid() {
        return movieid;
    }

    public void setMovieid(String movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Date getShowtime() {
        return showtime;
    }

    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movieid != null ? movieid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoviesList)) {
            return false;
        }
        MoviesList other = (MoviesList) object;
        if ((this.movieid == null && other.movieid != null) || (this.movieid != null && !this.movieid.equals(other.movieid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MoviesList[ movieid=" + movieid + " ]";
    }
    
}
