FROM openjdk:17-oracle
EXPOSE 8080
ADD target/financeapplication-0.0.1-SNAPSHOT.jar financeapplication.jar
ENTRYPOINT ["java", "-jar", "financeapplication.jar" ]