FROM tomcat
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/

COPY ./target/rest_app-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/rest-app.war
CMD ["catalina.sh","run"]