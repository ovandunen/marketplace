FROM java:8 
VOLUME /tmp
ADD marketplace-0.1.0.jar marketplace.jar
RUN sh -c 'touch marketplace.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","marketplace.jar"]

