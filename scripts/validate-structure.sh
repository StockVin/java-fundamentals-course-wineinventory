# scripts/validate-structure.sh
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
declare -a required=( "starter-files" "completed-examples" "docs" "scripts" "assets" "README.md" "LICENSE" )

echo "Validando estructura del repositorio en $ROOT"
missing=0
for item in "${required[@]}"; do
  if [ ! -e "$ROOT/$item" ]; then
    echo "  ❌ Falta: $item"
    missing=$((missing+1))
  else
    echo "  ✅ Presente: $item"
  fi
done

if [ $missing -ne 0 ]; then
  echo
  echo "Faltan $missing elementos. Por favor, complétalos antes de entregar."
  exit 2
fi

echo "Estructura OK."