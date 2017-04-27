package de.maerchenfloete.chat;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@ManagedBean
public class Chat implements Serializable {

  private String name = "Chat Home";

  private List<Entry> entries = new ArrayList<Entry>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }
}
