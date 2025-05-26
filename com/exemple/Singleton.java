package com.exemple;

/**
 * Class singleton
 * Une seule instance
 */
public class Singleton
{
    /**
     * instance ...
     */
    private static Singleton instance;

    /**
     * Constructeur
     */
    private Singleton()
    {

    }

    /**
     * Méthode getInstance
     * @return instance
     */
    public static Singleton getInstance() {
    if (instance == null)
    {
        instance = new Singleton();
    }
    return instance;
    }
}