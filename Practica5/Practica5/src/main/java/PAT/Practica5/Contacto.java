package PAT.Practica5;

public class Contacto {
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String country;
    private String state;
    private String zip;
    private String tarifa;
    
    public Contacto(String firstname, String lastname, String email, String address, String country, String state,
            String zip, String tarifa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.country = country;
        this.state = state;
        this.zip = zip;
        this.tarifa = tarifa;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Contacto [address=" + address + ", country=" + country + ", email=" + email + ", firstname=" + firstname
                + ", lastname=" + lastname + ", state=" + state + ", tarifa=" + tarifa + ", zip=" + zip + "]";
    }

    
}
