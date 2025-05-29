package potato.tea_api.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teapis")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    private String description;

    @Column(name = "flavor_profile")
    private String flavor_profile;

    private int quantity;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFlavor_profile() {
        return flavor_profile;
    }

    public void setFlavor_profile(String flavor_profile) {
        this.flavor_profile = flavor_profile;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}