package com.greentech.greenconnect2.entities;


import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.regex.Pattern;

@Entity

public class Email implements Serializable {

 // @Transient
 private static final String EMAIL_EXPEDITEUR = "olivier.milia.dev@gmail.com";
 //@Transient
 private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 //@Transient
 private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);
 @Id
 private Long id;
 private String destinataire;
 private String message;

 public Email() {
 }

 public Email(String email) {
  Assert.isTrue(isValid(email), "Invalid email address !");

 }

 /**
  * @param candidate
  * @return
  */
 public boolean isValid(String candidate) {
  return candidate == null ? false : PATTERN.matcher(candidate).matches();
 }

}
