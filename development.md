# April 9 2026
- Created project folder for backend and frontend
- Connected the root folder to Github repository

# April 10 2026
- Set up PostgreSQL database locally
- Created CalendarUser model that represents the user
- Connected the CalendarUser to the PostgreSQL and created a table in the database for the user
- Ran into some version issues. The project was running on version 4.0.5, I downgraded to 3.4.0 to avoid support issues.
- I made sure the database crendentials were written in environmental variables like ${DB_USERNAME} so that credentials can not be leaked. Also so that this repository can be kept public. 

# April 11 2026
- Started working on authentication. I've set up JWT authentication for the app.
- So far I have mae a JwtUtils, 3 DTO's : AuthResponse, LoginRequest & RegisterRequest.
- I've started working on AuthController but not yet finished.
- The idea with JWT is to keep the heavy lifting of authentication away from the server, since it keeps the authentication process stateless. 

# April 15 2026
- Sketched an architecture diagram for how data will flow between parts of the application
