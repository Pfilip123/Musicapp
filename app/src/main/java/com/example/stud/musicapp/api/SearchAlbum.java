package com.example.stud.musicapp.api;

/**
 * Created by W57003 on 2018-06-14.
 */


public class SearchAlbum {
    public int idAlbum ;
    public int idArtist ;
    public int intSales ;
    public float intScore ;
    public int intYearReleased ;
    public String strAlbum ;
    public String strArtist ;


    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
    }

    public int getIntSales() {
        return intSales;
    }

    public void setIntSales(int intSales) {
        this.intSales = intSales;
    }

    public float getIntScore() {
        return intScore;
    }

    public void setIntScore(float intScore) {
        this.intScore = intScore;
    }

    public int getIntYearReleased() {
        return intYearReleased;
    }

    public void setIntYearReleased(int intYearReleased) {
        this.intYearReleased = intYearReleased;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }
}