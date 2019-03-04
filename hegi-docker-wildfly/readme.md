hegi-docker-wildlfy
===================

Author: Bernd Hegmanns

Aufbau
------
Das Projekt besteht aus einem einfachen RS-Projekt sowie einem Verzeichnis mit einer Docker-Datei.

Anleitung
---------

1. �ffne eine Shell im Verzeichnis "docker"
2. F�hre aus:

		docker build --tag hegi/wildfly .
3. F�hre aus:

		docker run -it -p 8080:8080 -p 9990:9990 hegi/wildfly

4. Wechsle ins Basisverzeichnis/Projektverzeichnis
5. F�hre den folgenden Maven-Befehl aus:

		mvn clean install

6. Nach erfolgtem Build sollte in der ge�ffneten Docker-Wildfly-Shell der Deploymentvorgang beobachtet werden k�nnen.
7. Rufe die folgende URL auf (im Browser, oder einer anderen Anwendung):

		http://localhost:8080/restful-service/api/add/3/5
		
		