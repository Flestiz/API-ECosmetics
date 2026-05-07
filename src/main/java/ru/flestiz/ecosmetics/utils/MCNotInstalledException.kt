package ru.flestiz.ecosmetics.utils;

public class MCNotInstalledException extends UnsupportedOperationException {
    public MCNotInstalledException() {
        super("Error: ECosmetics is not installed, please install it to use this API.");
    }
}
