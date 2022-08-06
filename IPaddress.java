// Defanging an IP Address
class IPaddress {
    public String defangIPaddr(String address) {
        String str = address.replace(".", "[.]");
        return (str);
    }
}