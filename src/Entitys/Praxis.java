package Entitys;
import java.sql.*;
import jakarta.persistence.*;

@Entity
@Table(name="Praxis")
public class Praxis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic
    @Column(name = "PraxisNr")
    private int praxisNr;

    @Basic
    @Column(name = "Praxisname")
    private String praxisName;

    @Basic
    @Column(name = "Straße")
    private String straße;

    @Basic
    @Column(name = "PLZ")
    private String plz;

    @Basic
    @Column(name = "Ort")
    private String ort;

    @Basic
    @Column(name = "Land")
    private String land;

    @Basic
    @Column(name = "Inhaber")
    private int inhaber;
}
