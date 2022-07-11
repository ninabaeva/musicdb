package com.example.musicdbapp.model.view;

import com.example.musicdbapp.model.entity.enums.ArtistEnum;
import com.example.musicdbapp.model.entity.enums.GenreEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlbumViewModel {

    private Long id;
    private String name;
    private String imgUrl;
    private Integer copies;
    private BigDecimal price;
    private LocalDate releasedDate;
    private GenreEnum genre;
    private ArtistEnum artist;

    public AlbumViewModel() {

    }

    public Long getId() {
        return id;
    }

    public AlbumViewModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AlbumViewModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public AlbumViewModel setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public Integer getCopies() {
        return copies;
    }

    public AlbumViewModel setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AlbumViewModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDate getReleasedDate() {
        return releasedDate;
    }

    public AlbumViewModel setReleasedDate(LocalDate releasedDate) {
        this.releasedDate = releasedDate;
        return this;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public AlbumViewModel setGenre(GenreEnum genre) {
        this.genre = genre;
        return this;
    }

    public ArtistEnum getArtist() {
        return artist;
    }

    public AlbumViewModel setArtist(ArtistEnum artist) {
        this.artist = artist;
        return this;
    }
}
