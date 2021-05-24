FROM dockette/jdk8
WORKDIR /opt
EXPOSE 8090
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar