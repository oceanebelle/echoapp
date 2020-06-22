

Building app and the docker image locally

    mvn clean install

Build the image and run within maven

    mvn docker:build docker:run    

After docker image is created in local docker repository, run using docker run

    docker run -it --rm -p 8080:8080  oceanebelle/echoapp