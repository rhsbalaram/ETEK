FROM dockette/jdk8
WORKDIR /opt
EXPOSE 8000
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar