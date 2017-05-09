
package data_json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Nazwa",
    "Producent",
    "DisplayPort",
    "DVI",
    "HDMI",
    "IloscPamieciRAM",
    "Dodatkowe",
    "Cena"
})
public class KartagraficznaParametry {

    @JsonProperty("Nazwa")
    private String nazwa;
    @JsonProperty("Producent")
    private String producent;
    @JsonProperty("DisplayPort")
    private String displayPort;
    @JsonProperty("DVI")
    private String dVI;
    @JsonProperty("HDMI")
    private String hDMI;
    @JsonProperty("IloscPamieciRAM")
    private String iloPamiCiRAM;
    @JsonProperty("Dodatkowe")
    private String dodatkowe;
    @JsonProperty("Cena")
    private Integer cena;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Nazwa")
    public String getNazwa() {
        return nazwa;
    }

    @JsonProperty("Nazwa")
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @JsonProperty("Producent")
    public String getProducent() {
        return producent;
    }

    @JsonProperty("Producent")
    public void setProducent(String producent) {
        this.producent = producent;
    }

    @JsonProperty("DisplayPort")
    public String getDisplayPort() {
        return displayPort;
    }

    @JsonProperty("DisplayPort")
    public void setDisplayPort(String displayPort) {
        this.displayPort = displayPort;
    }

    @JsonProperty("DVI")
    public String getDVI() {
        return dVI;
    }

    @JsonProperty("DVI")
    public void setDVI(String dVI) {
        this.dVI = dVI;
    }

    @JsonProperty("HDMI")
    public String getHDMI() {
        return hDMI;
    }

    @JsonProperty("HDMI")
    public void setHDMI(String hDMI) {
        this.hDMI = hDMI;
    }

    @JsonProperty("IloscPamieciRAM")
    public String getIloPamiCiRAM() {
        return iloPamiCiRAM;
    }

    @JsonProperty("IloscPamieciRAM")
    public void setIloPamiCiRAM(String iloPamiCiRAM) {
        this.iloPamiCiRAM = iloPamiCiRAM;
    }

    @JsonProperty("Dodatkowe")
    public String getDodatkowe() {
        return dodatkowe;
    }

    @JsonProperty("Dodatkowe")
    public void setDodatkowe(String dodatkowe) {
        this.dodatkowe = dodatkowe;
    }

    @JsonProperty("Cena")
    public Integer getCena() {
        return cena;
    }

    @JsonProperty("Cena")
    public void setCena(Integer cena) {
        this.cena = cena;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
