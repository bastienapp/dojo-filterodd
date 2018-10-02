class FilterOdd {

    public static int[] filter(int tab[]) {
       
        for(int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                 tab[i] = 0;
            }
        }
        return tab;
    }
}
