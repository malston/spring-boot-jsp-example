# spring-boot-jsp-example

To use MySQL, run the application with the mysql profile: e.g.,

```bash
$ mvn spring-boot:run -Dspring.profiles.active=mysql 
```

Setup the MySQL database by running:

```bash
mysql -uroot -p mysql < src/main/resources/db/setup-mysql.sql
```

