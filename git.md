# Taller Teórico - Git

## 1. ¿Qué es un repositorio en Git?
Un repositorio es un espacio donde Git almacena el historial completo de un proyecto, incluyendo versiones, ramas y cambios. A diferencia de un proyecto normal, guarda el control de versiones.

## 2. Áreas principales de Git
- Working Directory: Donde se editan los archivos.
- Staging Area: Área donde se preparan los cambios.
- Repository: Donde se guardan los commits definitivos.

## 3. Objetos internos de Git
- Blob: Contiene archivos.
- Tree: Representa directorios.
- Commit: Guarda un punto en el historial.
- Tag: Marca versiones importantes.

## 4. ¿Cómo se crea un commit?
Con:
git add .
git commit -m "mensaje"

Un commit almacena autor, fecha, mensaje y referencia al commit anterior.

## 5. Diferencia entre git pull y git fetch
- git fetch: Descarga cambios sin fusionarlos.
- git pull: Descarga y fusiona automáticamente.

## 6. ¿Qué es un branch?
Es una rama que permite trabajar en paralelo sin afectar la rama principal.

## 7. ¿Cómo se realiza un merge?
git merge nombre_rama
Pueden surgir conflictos si dos personas modifican la misma línea.

## 8. Área de staging
Se usa con git add.
Si se omite, los cambios no se incluyen en el commit.

## 9. .gitignore
Archivo que indica qué archivos no deben subirse al repositorio.

## 10. Commit amend
git commit --amend
Permite modificar el último commit sin crear uno nuevo.

## 11. git stash
Guarda cambios temporales sin hacer commit.

## 12. Deshacer cambios
- git reset
- git revert
- git checkout

## 13. Remotos
origin: repositorio principal
upstream: repositorio original en un fork

## 14. Inspeccionar historial
- git log
- git diff
- git show
