package one.innovation.digital.restapi.states;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import one.innovation.digital.restapi.countries.Country;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private long id;

    @Column(name = "nome")
    private String name;

    private String uf;

    private Integer ibge;

    /*@Column(name = "pais")
    private Integer countryId;*/

    // @ManyToOne many states belong a country
    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    // How hibernate will handle the json data type
    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public List getDdd() {
        return ddd;
    }

    /*public Integer getCountryId() {
        return countryId;
    }*/

    public Country getCountry(){
        return country;
    }
}
