FROM oceanebelle/openjdk:latest

ADD /maven/${project.build.finalName}.${project.packaging} /opt/app/${project.artifactId}.${project.packaging}

WORKDIR $APP_HOME

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "${project.artifactId}.${project.packaging}"]
