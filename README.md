# Fenrir-Service

##Mobile controller calls
De mobile controller heeft twee calls die gemaakt kunnen worden om met de backend te praten.

**De eerste call die gemaakt kan worden**
```
<url>/mobile/check?number=<phone number>
```
Er is 1 parameter. De parameter number. Die slaatnop de telefoon nummer van de telefoon zefl. Deze wordt gebruikt om te kijken welke user bij dit nummer hoort. Daarna wordt deze gebruikt om te kijken of er een attempt is. Er komt een 0 of 1 terug. Dit staat voor false of true. Als er een attempt is komt er 1 terug en anders komt er 0 terug.

**de tweede call die gemaakt wordt:**
```
<url>/mobile/auth?number=<phone number>&auth=<succeeded|failed>
```
Er zijn twee parameters, de parameters number en auth. number slaat op de telefoon nummer van het toestel. Auth slaat op of het gelukt is of niet gelukt is. Als auth weg gelaten wordt is het bij definitie failed door default values. Er komt terug of de attempt update gelukt is of niet. Er kan ook 2 terug komen wat opslaat dat de parameters niet goed zijn. Er wordt ook een string terug gesturud die dit zegt. Waardoor men dat kan loggen of uitprinten op console.

##Login controller calls
De login controller heeft 1 call die gemaakt kan worden om een login attempt te starten.

**De login call**
```
<url>/login?username=<username>&company=<company>
```
Er zijn twee parameters, de parameters username en company. Username is de username van de persoon die probeerd in te loggen. Company slaat op het bedrijf waar de user werkt of het bedrijf van het product waar de user probeerd in te loggen.Er komt terug of de attempt gelukt is of niet. Als er 0 terug komt dan is er iets heel erg fout gegaan, als er 1 terug komt dan is er iets fouts in de parameters of de attempt zelf en als er 2 terug komt is het gelukt.

##Management controller calls
De management controller heeft geen calls wegens het feit dat deze feature nog niet gemaakt zijn en binnen dit project niet meer geplanned zijn.
