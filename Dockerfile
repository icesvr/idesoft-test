FROM openjdk:11.0.6-jre 
COPY "./target/com.idesofttest-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 80
ENTRYPOINT ["java","-jar","app.jar"]