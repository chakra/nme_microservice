FROM java:8-jre

ADD ./target/transaction-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/transaction-service.jar"]

EXPOSE 7000