# Embabel Webapp Demo
embabel-webapp-demo is a sample Spring Boot web application illustrating how to 
integrate the Embabel agent framework with a modern web UI to build agentic, 
LLM-powered features in Java.

- Used deepseek-r1:8b model for this project.
```
C:\Users\abcha> ollama run deepseek-r1:8b
>>> Send a message (/? for help)
```

- Run your springboot main class 'EmbabelWebappDemoApplication' from IDE.

- Input: Go to POSTMAN and with POST request at http://localhost:8080/api/chat-2
```
{
  "request": "Give me the details of the movie Kill Bill"
}
```

- Output:
```
{
    "name": "Kill Bill: Volume 1",
    "releaseDate": "2003-01-25",
    "director": "Quentin Tarantino",
    "actors": [
        "Quentin Tarantino",
        "Uma Thurman",
        "David Carrington Elkins"
    ]
}
```