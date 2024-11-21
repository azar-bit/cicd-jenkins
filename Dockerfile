FROM openjdk:17-alpine
WORKDIR /opt
ENV PORT 9091
EXPOSE 9091
CMD target/*.jar /opt/app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]