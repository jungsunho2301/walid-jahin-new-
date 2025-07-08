package com.example.newweb.repository;

import com.example.newweb.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
}
