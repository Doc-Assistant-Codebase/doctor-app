HOW TO RUN THE APPLICATION
---------------------------
Open the terminal, and then type: 

--> ./gradlew bootRun (If running on Mac/Ubuntu)
--> gradlew bootRun (If running on Win)

If you want to run the application thru Eclipse,

Step # 1)  Go to com.doctor.app.DoctorApplication.java
Step # 2) Then, Run As -> Java Application

1) Be sure you are connected to the internet.
2) Be sure you are not behind a firewall.
3) Application will take a while to start first time as it will download the dependencies.

----------
Endpoints
----------

1) Populate the DB from drugs excel file. Right now, the file is available in classpath.
URL: http://localhost:8080/doctor-app/updateDrugs

2) Get all drugs.
URL: http://localhost:8080/doctor-app/drugs

3) Get all drugs of a specific form (Step # 2 of Prescription screen)
URL: http://localhost:8080/doctor-app/drugs?form=Gel

----------------------
CURRENT CONFIGURATION
----------------------
Current version uses H2 DB. If you want to change the underlying DB, change the settings in application.properties

----------------------------
TO DO - Currently working on
-----------------------------
1) Add "Upload" button on UI and allow the user to select excel file from file system.
2) Integrate patient details with drugs.
3) Test cases