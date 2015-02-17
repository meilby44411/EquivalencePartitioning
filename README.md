# EquivalencePartitioning
Opgave: Refaktorisering og systematisk test

To Eclipse-projekter er delt på GitHub [link]
 - Mappen "Simple Calculator" indeholder opgavens udgangspunkt
 - Mappen "Simple Add Calculator" indeholder dagens demonstration (til reference)

Fork GitHub-repositoriet (eller download det hvis der er problemer med at forke)

Med udgangspunkt i Decimal-klassen løses følgende opgaver: 
 - Gyldige operander (tallene) begrænses til være i intervallet [-100.0;100.0] 
    - Vi indfører begrænsningen for øvelsens skyld
    - Division med 0 bør resultere i en fejlbesked eller exception
 - Refaktoriser kildekoden for at gøre den mere: 
    - objektorienteret/funktionsopdelt
    - testbar (især med henblik på at automatisere testimplementationen - husk tips fra efteråret)
    - læsevenlig (omdøb navne på klasser, metoder og variable hvis de ikke er beskrivende, tilføj evt. kommentarer)
 - Udarbejd en testsuite for Simple Calculator på baggrund af ækvivalensklasseopdeling og grænseværdianalyse 
    - Husk at tage højde for ugyldige input
    - Husk at tage højde for alle tre input
 - Implementer testsuiten vha. JUnit
    - Husk at placere testklassen i en separat source folder
