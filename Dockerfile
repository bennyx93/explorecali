# docker run --name ec-app -p 8080:8080 -e server=ec-mysql -e port=3306 -e dbuser=cali_user -e dbpassword=cali_pass --link ec-mysql:mysql -d explorecali

FROM openjdk:17
WORKDIR /
ADD src/main/resources/db/migration /var/migration
ADD target/explorecali-0.0.1-SNAPSHOT.jar //
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=docker", "-jar", "explorecali-0.0.1-SNAPSHOT.jar"]