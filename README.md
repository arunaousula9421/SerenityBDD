# SerenityBDD
Selenium + BDD + Serenity + Jira + Maven + JUnit

To Execute Tests

1. Update feature files root in Runner.java file
2. Add tags in Runner file

`mvn verify`

To Execute with tags from Command Line

` mvn clean verify -Dcucumber.options="--tags @Login,@Compose"`
