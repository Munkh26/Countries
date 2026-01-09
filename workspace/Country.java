public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String capital;
  private String language;
  private String image;

  // add constructors
  public Country() {
    name = "";
    capital = "";
    language = "";
    image = "";
  }

  public Country(String n, String cap, String lang, String img) {
    name = n;
    capital = cap;
    language = lang;
    image = img;
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String name() {
    return name;
  }

  public String capital() {
    return capital;
  }

  public String language() {
    return language;
  }
  
  public String image() {
    return image;
  }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString() {
    return name + "'s capital is " + capital + " and its primary language is " + language;
  } 

}