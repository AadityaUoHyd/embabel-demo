# Embabel Agent Framework Samples
embabel-demo offers sample projects demonstrating the Embabel Agent Framework for 
building Java applications using Spring, web, and shell integrations.
Embabel is a JVM-based agent framework that lets you build intelligent “agentic flows” 
by combining LLM (large language model) calls with code, using planning, strong typing, 
and composition to build safe, testable AI applications. Here is how for the first time I tried my hands on it.

Sample projects using the [Embabel](https://github.com/embabel) Agent Framework.

## Prerequisites
* JDK 21+
* Docker and Docker Compose
* I already have downloaded few LLMs locally, e.g. => Ollama3.2:latest (Run LLMs either docker or locally)

- In my system Powershell:
```
C:\Users\abcha> ollama list
NAME                        ID              SIZE      MODIFIED
llama3.2:latest             a80c4f17acd5    2.0 GB    3 months ago
mxbai-embed-large:latest    468836162de7    669 MB    6 months ago
deepseek-r1:8b              28f8fd6cdc67    4.9 GB    8 months ago

C:\Users\abcha>    ollama run llama3.2:latest
>>> Send a message (/? for help)
```

## References
* [Embabel](https://github.com/embabel)
* [Embabel Agent Framework](https://github.com/embabel/embabel-agent)
* [Official Embabel Agent Framework Samples](https://github.com/embabel/embabel-agent-examples)
* [Embabel User Guide](https://docs.embabel.com/embabel-agent/guide/0.1.2-SNAPSHOT/)
* [Rod Johnson Medium Blog](https://medium.com/@springrod)
