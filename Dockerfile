FROM openjdk:8
EXPOSE 9091
ADD target/demoApp1.jar demoApp1.jar
ENTRYPOINT [ "java","-jar","/demoApp1.jar" ]