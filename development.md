# April 9 2026
- Created project folder for backend and frontend
- Connected the root folder to Github repository

# April 10 2026
- Set up PostgreSQL database locally
- Created CalendarUser model that represents the user
- Connected the CalendarUser to the PostgreSQL and created a table in the database for the user
- Ran into some version issues. The project was running on version 4.0.5, I downgraded to 3.4.0 to avoid support issues.
- I made sure the database crendentials were written in environmental variables like ${DB_USERNAME} so that credentials can not be leaked. Also so that this repository can be kept public. 
