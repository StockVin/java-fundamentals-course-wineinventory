# Compila y ejecuta una lección en starter-files/<leccion>
param(
  [string]$lesson,
  [string]$mainClass = "Main"
)
if (-not $lesson) { Write-Error "Uso: .\\run-local.ps1 <lesson-folder> [MainClass]"; exit 1 }
cd ..\starter-files\$lesson
javac *.java
java $mainClass
