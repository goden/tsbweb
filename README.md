#tsbweb

## Brief
A java web project running in glassfish by development netbeans.

## Enviornments

Below tools should be installed:

- **Netbeans**. An intregrated IDE to deveop J2EE in common. It is strongly recommended to download the latest LTS version, the current version is 12.0. The Java SDK should be installed prior to the installation. ([Download](https://netbeans.apache.org/download/nb120/nb120.html))
- **GlassFish**. A application server that implements J2EE. The current version is 5.0 with J2EE 8.  ([Download](https://download.oracle.com/glassfish/5.0/release/index.html))

## Get Started

### Add Application Server

Add the GlassFish aforementioned  as an new application server which running a java web project. Follow the below steps to complete the new application server addition:

1. Uncompress the glassfish to the target path. `GLASSFISH_HOME` is the directory that place the glassfish, e.g, `/Users/Demo/Dev/Labs/tsbweb`.
2. Open the netbean and switch the **Services** perspective as below illustration: <br/>
   <img src="pic/pic-4.png" alt="" height="250" />
3. Right-click the **Servers** item and click **Add Server...** option to launch the **Add Server Instance** wizard.
4. Select the **GlassFish Server** option of the Server field and enter the server instance name of the **Name** field. Click **Next** to the next step. <br/>
   <img src="pic/pic-5.png" alt="" height="400" />
5. Assign the absolute path of the GLASSFISH_HOME as the **Installation Location**. Click **Next** to the next step.
   <img src="pic/pic-6.png" alt="" height="460" />
6. Enter the **tsbweb** as the **Domain** field. Click **Finish** to add the server.
   <img src="pic/pic-7.png" alt="" height="460" />

### Create New Project

Suppose the Netbeans and GlassFish installations are complete before getting started.

1. Create a java web project by clicking **File** > **New Project** to launch the winzard in the **Netbeans**.
2. Select the **Web Application** from the **Java with Ant** > **Java Web**. Click **Next** to next step.
   <img src="pic/pic-1.png" alt="" height="400" />
3. Enter the **tsbweb** as **Project Name** field and ensure the path. Click **Next** to the next step.
   <img src="pic/pic-2.png" alt="" height="370" />
4. Assign the instance at the **Add Application Server** section. Click **Finish** to complete the creation project.
   <img src="pic/pic-3.png" height="370" />

### Running Web Project

Run the application server to make sure the web project is functioning on the application server. Right-click the **tsbweb** project and select the **Run** item to build the project. The browser will open the demo page once the deployment has been done.

### Generate New Entity Classes from Database

In order to fast generate the entity classes from the database, follow the below steps to complete the generation:

1. Right-click the project and select the **Entity Classes from Database...** item. Click **Next** to launch the wizard.
2. Assign the right database connection and move all the tables of the **Available Tables** to the **Selected Tables**. Click the **Next** to the next  step.
   <img src="pic/pic-8.png" height="430" />
3. Assign the package and **com.taishin.model.entity** is the destination. Click **Next** to the next step.
   <img src="pic/pic-9.png" height="415" />
4. Specify the default mapping options. Select the **Fully Qualified Database Table Names** and **Attributes for Regenerating Tables** options. Click **Finish** to complete the generation.
   <img src="pic/pic-10.png" height="415" />