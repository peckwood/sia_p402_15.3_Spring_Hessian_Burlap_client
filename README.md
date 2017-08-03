## remote services

#### List of remoting technologies

- RMI
- Hessian or Burlap
- HTTP invoker
- JAX-RPC and JAX_WS

#### RMI

- Java Based (Base server and client must be written in Java, with same version of Java runtime)
- Needs a registry which hosts services
- diffculty working across firewalls, and to resolve this, setting up RMI tunneling can be tricky

#### Hessian and Burlap

- Multiple language support(PHP, Python, C++ and C#)
- Burlap uses XML messages, so it's more human readable(for debugging), supports languages with no Hessian implementation
- Hessian uses binary messages, so it's more bandwidth-friendly
- Hessian has no registry, but hessian is HTTP-based, `HessianServiceExporter` is implemented as MVC controller
- Note Spring Hessian supoort jar is not in Spring context, it is in Spring web
- Both server must have Hessian jar