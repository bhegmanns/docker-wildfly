hegi-docker-wildlfy
===================

Author: Bernd Hegmanns

Aufbau
------
Das Projekt besteht aus einem einfachen RS-Projekt sowie einem Verzeichnis mit einer Docker-Datei.

Anleitung
---------

1. Öffne eine Shell im Verzeichnis "docker"
2. Führe aus:

		docker build --tag hegi/wildfly .
3. Führe aus:

		docker run -it -p 8080:8080 -p 9990:9990 hegi/wildfly

4. Wechsle ins Basisverzeichnis/Projektverzeichnis
5. Führe den folgenden Maven-Befehl aus:

		mvn clean install

6. Nach erfolgtem Build sollte in der geöffneten Docker-Wildfly-Shell der Deploymentvorgang beobachtet werden können.
7. Rufe die folgende URL auf (im Browser, oder einer anderen Anwendung):

		http://localhost:8080/restful-service/api/add/3/5
		
		