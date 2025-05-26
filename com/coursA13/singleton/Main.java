class Main {

    public static void main(String[] args) {

        /* Empecher de créer une instance
        Singleton s1 = new Sinleton();
        Singleton s2 = new Sinleton();
        */
        // La nouvelle de cherche l'instance doit :

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // s1 et s2 doivent être les même

        // meme adresse memoire
        //System.out.println(s1 == s2);

    }
}