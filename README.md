# Prototipos-Coil-Vic
Este repositorio es para subir sus prototipos del proyecto COIL-VIC sobre diseño, les recordamos usar cada quien su branch y no usar la rama principal

Les adjuntamos algunos comandos para que suban sus archvios:

git switch -c Nombre rama: Para crear su branch

git branch: ver ramas

git push -u origin nombrRama: Para subir su rama

git add .: para subir a stage los cambios

git commit: Para completar sus cambios.

git fetch: Actualizar para ver si hay cambios.

git push: Para subir sus cambios.

git pull: Descargar los cambios.

git merge RamaOrigen RamaDestino: Juntos 2 ramas

_____________________________________________________________________________
########################## Posibles errores #################################

Configurando el repositorio me he dado cuenta que hay un posible error, 
en algunas ocasiones no permite hacer el primer pull dado que no se ha
vinculado la rama inicial, para vincularla debemos de:
-Vincular nuestra rama local con la remota:
Escribir:    git pull origin main
-Renombrar nuestra rama:
Escribir:   git branch -m main

-Para subir a la rama algo por primera vez se escribe:
        git push --set-upstream origin main

Con esto se debería de vincular la rama y se podría empezar a usar todo
como se haría normalmente.

##############################################################################
______________________________________________________________________________

Recordemos de avisar antes de hacer un merge y corregir los posibles problemas que pueda tener. 
