FROM oceanebelle/openjdk:latest

#ADD /maven/${project.build.finalName}.${project.packaging} /opt/app/${project.artifactId}.${project.packaging}
COPY /maven/${project.build.finalName}.${project.packaging} /${project.artifactId}.${project.packaging}

WORKDIR $APP_HOME

EXPOSE 8080

#ENTRYPOINT ["java", "-jar", "/opt/app/${project.artifactId}.${project.packaging}"]

#ENTRYPOINT ["ls", "-ctrla", "/opt/app"]

ENTRYPOINT ["java", "-jar", "/${project.artifactId}.${project.packaging}"]
