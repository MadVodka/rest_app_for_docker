FROM tomcat
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY ./target/rest_app-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/rest-app.war
CMD ["catalina.sh","run"]