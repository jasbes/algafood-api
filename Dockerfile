# First stage: complete build environment
FROM maven:3-jdk-11 AS builder

# add pom.xml and source code
ADD ./pom.xml pom.xml
ADD ./src src/

# package jar
RUN mvn clean package

# Second stage: minimal runtime environment
From openjdk:11-jre

# copy jar from the first stage
COPY --from=builder target/algafood-api-1.0.0-SNAPSHOT.jar algafood-api.jar

EXPOSE 8080

CMD ["java", "-jar", "algafood-api.jar"]