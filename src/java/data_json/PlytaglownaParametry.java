
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
    "Chipset",
    "CzestotliwoscPamieciRAM",
    "GniazdaPamieci",
    "Gniazdo procesora",
    "Panel tylny",
    "Cena"
})
public class PlytaglownaParametry {

    @JsonProperty("Nazwa")
    private String nazwa;
    @JsonProperty("Producent")
    private String producent;
    @JsonProperty("Chipset")
    private String chipset;
    @JsonProperty("CzestotliwoscPamieciRAM")
    private String czStotliwoCiPracyPamiCiMHz;
    @JsonProperty("GniazdaPamieci")
    private String gniazdaPamiCi;
    @JsonProperty("Gniazdo procesora")
    private String gniazdoProcesora;
    @JsonProperty("Panel tylny")
    private String panelTylny;
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

    @JsonProperty("Chipset")
    public String getChipset() {
        return chipset;
    }

    @JsonProperty("Chipset")
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @JsonProperty("CzestotliwoscPamieciRAM")
    public String getCzStotliwoCiPracyPamiCiMHz() {
        return czStotliwoCiPracyPamiCiMHz;
    }

    @JsonProperty("CzestotliwoscPamieciRAM")
    public void setCzStotliwoCiPracyPamiCiMHz(String czStotliwoCiPracyPamiCiMHz) {
        this.czStotliwoCiPracyPamiCiMHz = czStotliwoCiPracyPamiCiMHz;
    }

    @JsonProperty("GniazdaPamieci")
    public String getGniazdaPamiCi() {
        return gniazdaPamiCi;
    }

    @JsonProperty("GniazdaPamieci")
    public void setGniazdaPamiCi(String gniazdaPamiCi) {
        this.gniazdaPamiCi = gniazdaPamiCi;
    }

    @JsonProperty("Gniazdo procesora")
    public String getGniazdoProcesora() {
        return gniazdoProcesora;
    }

    @JsonProperty("Gniazdo procesora")
    public void setGniazdoProcesora(String gniazdoProcesora) {
        this.gniazdoProcesora = gniazdoProcesora;
    }

    @JsonProperty("Panel tylny")
    public String getPanelTylny() {
        return panelTylny;
    }

    @JsonProperty("Panel tylny")
    public void setPanelTylny(String panelTylny) {
        this.panelTylny = panelTylny;
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
