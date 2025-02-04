public class Contacto {
    private String name;
    private String phoneNumber;

    public Contacto(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto CreateContact (String name, String PhoneNumber){

        Contacto contacto = new Contacto(name, PhoneNumber);

        return contacto;
    }



}
