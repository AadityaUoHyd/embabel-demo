# Embabel Shell Demo

Run your springboot project using IDE.
- Input:
``` 
starwars> x "Give me the details of the movie Pulp Fiction"
```

- Output:
```
You asked: UserInput(content=Give me the details of the movie Pulp Fiction, timestamp=2025-10-08T11:06:53.136983200Z)

{
"name" : "Pulp Fiction",
"releaseDate" : "1994-10-14",
"director" : "Quentin Tarantino",
"actors" : [ "John Travolta", "Uma Thurman", "Samuel L. Jackson", "Bruce Dern", "Harvey Keitel" ]
}

LLMs used: [llama3.2:latest] across 3 calls
Prompt tokens: 1,312,
Completion tokens: 99
Cost: $0.0000

Tool usage:


The Force is what gives a Jedi his power.
```