package com.example.wap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="movies")
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String title;
  private String poster;
  private String imdbID;

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPoster() {
    return this.poster;
  }

  public void setPoster(String poster) {
    this.poster = poster;
  }

  public String getImdbID() {
    return this.imdbID;
  }

  public void setImdbID(String imdbID) {
    this.imdbID = imdbID;
  }
}
