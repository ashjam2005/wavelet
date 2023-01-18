import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    StringBuilder builder = "";
    int num2 = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("Asherja: %d", num);
        } else if (url.getPath().equals("/increment")) {
            num += 1;
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    builder.append(" " + parameters[1])
                    num++;
                    return String.format("You have changed the list. It now contains ", builder);
                }
            }
            else if (url.getPath().contains("/search")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {                   
                    String[] words = builder.split(" ");
                    String[] success = new String[num];
                    for (int i=0;i<words.length;i++)
                    {
                        if (words[i].contains(parameters[1])){
                            success[num2] = words[i];
                            num2++;
                        }
                    }
                    StringBuilder returnStuff = "";

                    for (int i=0;i<=num2;i++)
                    {
                        returnStuff.append(" " + success[i]);
                    }
                    return String.format("The list that contains " , parameters[1], "is ", returnStuff.toString());
                }
            }
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
