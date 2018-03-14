package ru.stqa.pft.addressbook;

public class GroupDataContact {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String companyname;
  private final String address;
  private final String homephone;
  private final String mobilephone;
  private final String firstemail;
  private final String website;
  private final String notes;

  public GroupDataContact(String firstname, String middlename, String lastname, String nickname, String title, String companyname, String address, String homephone, String mobilephone, String firstemail, String website, String notes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.companyname = companyname;
    this.address = address;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.firstemail = firstemail;
    this.website = website;
    this.notes = notes;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompanyname() {
    return companyname;
  }

  public String getAddress() {
    return address;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getFirstemail() {
    return firstemail;
  }

  public String getWebsite() {
    return website;
  }

  public String getNotes() {
    return notes;
  }
}
