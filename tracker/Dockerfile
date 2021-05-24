FROM dockette/jdk8
WORKDIR /opt
EXPOSE 8092
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar