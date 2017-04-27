package de.maerchenfloete.chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;

@SessionScoped
@ManagedBean
public class Controller implements Serializable {

  private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

  private Entry newEntry = new Entry();

  @ManagedProperty("#{chat}")
  private Chat chat;

  public String send() {

    final FacesContext facesContext = FacesContext.getCurrentInstance();
    final String remoteUser = facesContext.getExternalContext().getRemoteUser();
    LOG.info("Folgender Text wurde eingegeben: '{}' von '{}'", newEntry.getValue(), remoteUser);

    newEntry.setAuthor(remoteUser);
    newEntry.setTime(new Date());

    chat.getEntries().add(0, newEntry);

    newEntry = new Entry();

    return "/chat.xhtml";
  }

  public Entry getNewEntry() {
    return newEntry;
  }

  public void setNewEntry(Entry newEntry) {
    this.newEntry = newEntry;
  }

  public Chat getChat() {
    return chat;
  }

  public void setChat(Chat chat) {
    this.chat = chat;
  }
}
