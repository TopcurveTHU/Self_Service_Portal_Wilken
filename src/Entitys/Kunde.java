package Entitys;
import java.sql.*;
import jakarta.persistence.*;
@Entity
@Table(name="Kunde")
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "KundenNr")
    private int kdnr;

    @Basic
    @Column(name = "Vorname")
    private String vorname;

    @Basic
    @Column(name = "Nachname")
    private String nachname;


}