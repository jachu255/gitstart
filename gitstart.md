Git dokumentacja i przydatne instrukcje.

## Dokumentacja i instrukcje

- [Stany plików](#nr1)
- [git amend, edycja ostatniego comita](#nr2)

## Stany plików

zmodyfikowany, śledzony oraz zatwierdzony.

- zmodyfikowany – plik był edytowany, ale zmiana o tym nie została jeszcze nigdzie zapisana;
- śledzony – zmodyfikowany plik został oznaczony do zatwierdzenia przy najbliższej operacji commit;
- zatwierdzony – dokonana zmiana została zapisana i utrwalona w lokalnej bazie danych;

źródło https://stormit.pl/git/#stany-plikow-w-git

## git amend, edycja ostatniego comita

Można modyfikować treść komentarza najnowszego komita oraz jego zawartość.
Np zrobiona została literówka lub kolejne nie powinny być w nowym komicie.

    git commit –amend -m “Edit history”

źródło https://stormit.pl/git/#nadpisanie-historii-zmian-amend



https://tomaszprasolek.pl/rebase-podczas-synchronizacji-repozytorium-polecenie-git-pull-rebase/