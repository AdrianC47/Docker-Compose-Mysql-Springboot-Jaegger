FROM openjdk:17


COPY target/ServiceForDocker-0.0.1-SNAPSHOT.jar ServiceForDocker-0.0.1-SNAPSHOT.jar

## Set Jaeger configuration as environment variables
#ENV JAEGER_SERVICE_NAME=servicefordocker
#ENV JAEGER_AGENT_HOST=jaeger
#ENV JAEGER_AGENT_PORT=6831
#ENV JAEGER_HTTP_SENDER_URL=http://jaeger:14268/api/traces



ENTRYPOINT ["java", "-jar", "ServiceForDocker-0.0.1-SNAPSHOT.jar"]
