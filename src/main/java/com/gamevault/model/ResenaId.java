package com.gamevault.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ResenaId implements Serializable {

    private Long usuarioId;
    private Long videojuegoId;

    public ResenaId() {
    }

    public ResenaId(Long usuarioId, Long videojuegoId) {
        this.usuarioId = usuarioId;
        this.videojuegoId = videojuegoId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getVideojuegoId() {
        return videojuegoId;
    }

    public void setVideojuegoId(Long videojuegoId) {
        this.videojuegoId = videojuegoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResenaId that)) return false;
        return Objects.equals(usuarioId, that.usuarioId)
                && Objects.equals(videojuegoId, that.videojuegoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, videojuegoId);
    }
}
