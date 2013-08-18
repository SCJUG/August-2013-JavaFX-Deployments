August-2013-JavaFX-Deployments
==============================

Demos from Michael Prentice's presentation in August 2013
[Self-Contained Java Apps: Intro to JavaFX Packaging][]

Requirements
==============================

1. JDK 7u25, 7u40, 8 installed in separate locations
1. Eclipse (verified on 4.2.2)

Configuration
==============================

1. Configure the JDK locations in each project's build.xml file.
1. Configure or delete the references to JavaMail in the SwingFxDemo (3rd party library packing example).

Runtime
==============================

1. In Eclipse, select the updated build.xml file for the project and do Run As->Ant Build
1. After the build completes, you can run the packaged app .exe from Release/bundles/\<app\>/



[Self-Contained Java Apps: Intro to JavaFX Packaging]: https://docs.google.com/presentation/d/1nDLeDqnJZO_YzMsJflS11r-F6Soa4ZFKm02uBsbyhjE/edit?usp=sharing

