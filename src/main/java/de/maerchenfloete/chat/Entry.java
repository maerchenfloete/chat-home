package de.maerchenfloete.chat;

import java.util.Date;

public class Entry {

  private String author;
  private Date time;
  private String value;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void reset() {
    author = null;
    time = null;
    value = null;
  }
}
