FROM openjdk:8-jre-slim

# Add the jar with all the dependencies
ADD target/container-testngrunner.jar /usr/share/dumiduh/container-testngrunner.jar
ADD testng.xml /usr/share/dumiduh/testng.xml

WORKDIR	/usr/share/dumiduh/

ENTRYPOINT ["/usr/bin/java", "-cp", "container-testngrunner.jar","org.testngrunner.App"]
