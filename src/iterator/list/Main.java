package iterator.list;

public class Main {
    public static void main(String[] args) {
        {        // MonArrayList
            System.out.println("MonArrayList");
            MonArrayList monArrayList = new MonArrayList();
            monArrayList.add("A");
            monArrayList.add("B");
            monArrayList.add("C");
            parcourirList(monArrayList);
            parcourirIterator(monArrayList.iterator());
            parcourirIterable(monArrayList);
        }

        {        // MaLinkedList
            System.out.println("MaLinkedList");
            MaLinkedList maLinkedList = new MaLinkedList();
            maLinkedList.add("A");
            maLinkedList.add("B");
            maLinkedList.add("C");
            parcourirList(maLinkedList);
            parcourirIterator(maLinkedList.iterator());
            parcourirIterable(maLinkedList);
        }

        {        // MaLinkedListRecurssive (BONUS)
            System.out.println("MaLinkedListRecurssive");
            MaLinkedListRecurssive maLinkedListRecurssive = new MaLinkedListRecurssive();
            maLinkedListRecurssive.add("A");
            maLinkedListRecurssive.add("B");
            maLinkedListRecurssive.add("C");
            parcourirList(maLinkedListRecurssive);
        }

        {        //Echiquier
            System.out.println("Echiquier");
            Echiquier echiquier = new Echiquier(4, 3);
            echiquier.set(0, 0, "T");
            echiquier.set(0, 1, "C");
            echiquier.set(0, 2, "F");
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 3; y++) {
                    System.out.println(echiquier.get(x, y));
                }
            }
            // parcourirList(echiquier); ==> impossible echiquier n'est pas une liste !
            parcourirIterator(echiquier.iterator());
            parcourirIterable(echiquier);
        }

    }

    /**
     * Parcours n'importe quelle Liste
     */
    private static void parcourirList(MaList maList) {
        System.out.println("parcourirList");
        int size = maList.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(maList.get(i));
        }
    }

    /**
     * Encore mieux, Parcours n'importe quell Iterator
     */
    private static void parcourirIterator(Iterator iterator) {
        System.out.println("parcourirIterator");
        while (iterator.hasNext()) {
            String valeur = iterator.next();
            System.out.println(valeur);
        }
    }

    /**
     * Encore mieux mieux, Parcours n'importe quell Iterable
     */
    private static void parcourirIterable(Iterable iterable) {
        System.out.println("parcourirIterable");
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            String valeur = iterator.next();
            System.out.println(valeur);
        }
    }

}
