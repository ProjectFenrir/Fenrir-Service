# Fenrir-Service
Mobile interaction:
get data:
<url>/FenrirService/mobile/data?number=<number>
Used for get required data for authentication on mobile

complete authentication:
<url>/FenrirService/mobile/auth?number=<number>&auth=<"succeed"|"failed + message"|"timeout">
used to return to service to tell service it succeeded, failed or timed out

check login attempt:
<url>/FenrirService/mobile/check?number=<number>
used to check if a login attempt is waiting


Login controller:
<url>/FenrirService/login?username=<user>&company=<company>
starts an login attempt