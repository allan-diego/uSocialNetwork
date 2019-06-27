mvn package
mvn dependency:copy-dependencies
cd target && java -cp "SocialNetworkServer-0.0.1-SNAPSHOT.jar:dependency/*" br.edu.ifpe.igarassu.ipi.poo.usn.model.controller.server.SocialNetworkServer