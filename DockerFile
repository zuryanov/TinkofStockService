FROM bellsoft/liberica-openjdk-alpine-musl
COPY ./target/TinkoffService-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","TinkoffService-0.0.1-SNAPSHOT.jar"]