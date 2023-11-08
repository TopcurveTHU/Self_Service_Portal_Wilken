package Entitys;
import java.sql.*;
import jakarta.persistence.*;

@Entity
@Table(name="Sicherheit")
public class Sicherheit {

    @Id
    @Basic
    @Column(name = "Benutzername")
    private String benutzername;

    @Basic
    @Column(name = "Passwort")
    private String passwort;

    @Basic(optional = false)
    @Column(name ="KundenNr")
    private int kdnr;

}

