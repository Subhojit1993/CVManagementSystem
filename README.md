# CVManagementSystem

Developed this system using Java8.
Any new Fresher or experienced Candidate can post their CV to join the company &amp; 
the respective Admin or HR can shortilst candidates by their skills.

### Getting Started

At first, install Eclipse on your system.

### Eclipse Installation process

```
> sudo apt-get install openjdk-7-jdk
> sudo mv eclipse-java-luna-SR2-linux-gtk.tar.gz /opt
> cd /opt
> tar –xvf eclipse-java-luna-SR2-linux-gtk.tar.gz
> sudo gedit /usr/share/applications/eclipse.desktop

```
It will launch an empty file, copy and paste the followings into this empty file, as shown in following:

```
[Desktop Entry]

Name=Eclipse

Type=Application

Exec=/opt/eclipse/eclipse

Terminal=false

Icon=/opt/eclipse/icon.xpm

Comment=Integrated Development Environment

NoDisplay=false

Categories=Development;IDE;

Name[en]=eclipse.desktop

```
Save the file, and now run following command on terminal to automatically install this desktop file on your ubuntu system.

```
> sudo desktop-file-install /usr/share/applications/eclipse.desktop
> cd /usr/local/bin
> sudo ln -s /opt/eclipse/eclipse

```

There are two methods for getting started with this repo.

#### Familiar with Git?

Checkout this repo, install dependencies, then start the gulp process with the following:

```
> https://github.com/Subhojit1993/CVManagementSystem.git

```

#### Not Familiar with Git?
Click [here](https://github.com/Subhojit1993/CVManagementSystem) then download the .zip file.  Extract the contents of the zip file, then open the Eclipse IDE, and browse this file.
