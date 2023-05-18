public class TypeOfWebsite {
    public static void main(String[] args) {
        String url = "https://www.google.org";

        String protocol = url.substring(0, url.indexOf(":"));
//      You could also use lastIndexOf
        String type = url.substring(url.indexOf(".", 12)+1);


        if (protocol.equals("http")){
            System.out.println("The protocol is Hyper Text Transfer Protocol");
        }else if (protocol.equals("https")){
            System.out.println("The protocol is Hyper Text Transfer Protocol Secure");
        }else if (protocol.equals("ftp")){
            System.out.println("The protocol is File Transfer Protocol");
        }

        if (type.equals("com")){
            System.out.println("Type is Commercial");
        }else if (type.equals("gov")){
            System.out.println("Type is Governmental");
        }else if (type.equals(("org"))){
            System.out.println("Type is Organizational");
        }
    }
}
