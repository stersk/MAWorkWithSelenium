package com.mainacad.model;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class User {
  private String login;
  private String password;
  private String eMail;
}
