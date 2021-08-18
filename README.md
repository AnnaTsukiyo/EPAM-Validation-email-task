# Validations. EPAM Email

Implement validation method in [`EpamEmailValidation`](src/main/java/com/epam/rd/autotasks/validations/EpamEmailValidation.java):
```java
public static boolean validateEpamEmail(String color)
```

This method checks the input string for compliance with the rules for a regular EPAM email.
Let us define them:
- A regular EPAM email includes firstname and lastname (in English), separated by underscore ("_").
- EPAM email always ends with "@epam.com"
- When a person gets new EPAM email, but email with this firstname and lastname is already registered, we add "1" to the new email.
  If such email is registered as well, we use "2" and so on.

- Valid examples
```bash
william_shakespeare@epam.com
lu_e@epam.com
william_shakespeare1@epam.com 
william_shakespeare2@epam.com
```
- Invalid examples
```bash
william@epam.com
william.shakespeare@epam.com
william...shakespeare@epam.com
william-shakespeare@epam.com
shakespeare123@epam.com
william_$hakespeare@epam.com
```

While implementing the methods you might need to come up with *regular expressions*.
You may consider using [regex101.com](https://regex101.com/) to ease designing them.

You can and should use following methods\classes:
- [`matches`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#matches(java.lang.String))
- [`Pattern`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html)
- [`Matcher`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html#matcher(java.lang.CharSequence))

There are JUnit5 tests classes for making sure each method's behavior is correct.
You can use them yourself, for that you need to install Maven project manager and run the following command in the project folder:
```bash
mvn clean test
```