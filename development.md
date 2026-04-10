April 9: Initial Backend Setup
Status: Initial Milestone Reached.

Project Setup: Initialized the Spring Boot backend using Java 21.

DataSource Configuration: Fixed a startup error where the app failed because the database connection wasn't mapped yet.

Learning Curve: Explored Spring Boot's autoconfiguration. Realized that even small mistakes in the settings file can stop the entire app from launching.

April 10: Database Connection & Stability
Status: Database is live and tables are generated.

PostgreSQL Access: Recovered the database password, which allowed us to connect the backend to the local Postgres server without a full reset.

Version Sync: Found out the project was running an unstable version of Spring Boot (4.0.5). Downgraded to 3.4.0, which fixed several "package not found" errors.

Server Fix: Added the missing web server dependency (spring-boot-starter-web) so the app stays running on port 8080.

JPA Trigger: Created a UserRepository interface. This was the final piece that signaled Hibernate to actually create the calendar_users table in pgAdmin.
