# lab-springv3
Ce projet est un projet géré par  Maven. 
Il mets en oeuvre l'injection de dependances avec Spring par auto-cablage en utilisant l'annotation de spring : @Autowired.
La classe implementant l'interface dao est annoté avec @Repository
Et la classe implémentant l'interface service est annoté avec @service.
L'application est repartie en trois couches à savoir :
- La couche persistence : contient les classes POJO
- La couche dao : contient les classes accés aux données (Interface + classe Implementant l'interface)
- La couche service : contient les classes implémentant la logique métier de l'application. 
La dependance entre la couche dao et la couche service est gérée par spring : Injection de l'interface dao par auto-cablage @Autowired
