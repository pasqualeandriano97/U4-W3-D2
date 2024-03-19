package entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="eventi")
public class Evento {
  @Id
  @GeneratedValue
  private long id;

  @Column(name="titolo")
  private String title;

  @Column(name="dataEvento")
    private Date date;
  @Column(name="descrizione")
    private String description;
  @Column (name="tipoEvento")
  @Enumerated(EnumType.STRING)
  private tipoEvento tipo;
  @Column (name="numeroMassimoPartecipanti")
    private int maxParticipants;

  public Evento() {}
    public Evento(String title, Date date, String description, tipoEvento tipo, int maxParticipants) {
      this.title = title;        this.date = date;
        this.description = description;
        this.tipo = tipo;
        this.maxParticipants = maxParticipants;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public tipoEvento getTipo() {
        return tipo;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTipo(tipoEvento tipo) {
        this.tipo = tipo;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", tipo=" + tipo +
                ", maxParticipants=" + maxParticipants +
                '}';
    }
}
