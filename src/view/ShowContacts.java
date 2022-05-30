package view;

/**
 * Diese Klasse zeigt eine Liste von Kontakten an. Ein Kontakt hat einen
 * Vornamen, einen Nachnamen, ein Foto, E-Mail-Adressen haben
 */
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.Contact;

      public class ShowContacts extends Application {

    	  @Override
    	    public void start(Stage primaryStage) {
    	        try {
    	        	 ScrollPane root = new ScrollPane();
    	             VBox box = new VBox();
    	             box.setSpacing(20);

    	             ArrayList<Contact> contacts = new ArrayList<>();

    	             Contact Max = new Contact("Mustermann", "Max", "/resources/MasMustermann.jpg");
    	             Max.addeMail("max@Mustermann.com");
    	             Max.addeMail("max@gmail.com");
    	             contacts.add(Max);

    	             Contact Erika  = new Contact("Mustermann", "Erika ","/resources/ErikaMustermann.jpg");
    	             Erika.addeMail("erika@Mustermann.com");
    	             Erika.addeMail("erika@gmail.com");
    	             contacts.add(Erika);

    	             Contact Alex = new Contact("Mustermann","Alex","/resources/AlexMustermann.jfif");
    	             Alex.addeMail("Adam@Mustermann.com");
    	             Alex.addeMail("Adam@gmail.com");
    	             contacts.add(Alex);

    	             for (Contact h : contacts ) {
    	                 GridPane contactPane = showContact(h);
    	                 box.getChildren().add(contactPane);
    	             }

    	             root.setContent(box);
    	             Scene scene = new Scene(root,400,400);
    	             primaryStage.setScene(scene);
    	             primaryStage.show();
    	         } catch(Exception e) {
    	             e.printStackTrace();
    	         }
    	     }

    	  private GridPane showContact (Contact c) {
    	        GridPane root = new GridPane();
    	      //horizontale und vertikale lücke zwischen Spalten und Linien

    	        root.setHgap(10);
    	        root.setVgap(10);

    	     // Hier wird Platz um das Raster hinzugefügt
    	        root.setPadding(new Insets(25, 25, 25, 25));

    	        Label vorname = new Label("Vorname: "+c.getVorname());
    	        root.add(vorname, 1, 1);

    	        Label nachname = new Label("Nachname: "+c.getNachname());
    	        root.add(nachname, 1,2);

    	        Image image = new Image (getClass().
    	        getResource( c.getFoto()).toString());

    	        ImageView imageview = new ImageView(image);
    	        root.add(imageview, 1, 0);

    	        Label emails = new Label("E-Mail: ");
    	        root.add(emails,1, 3);

    	        root.add(showEMails(c), 1, 4, 2, 1);
    	        return root;
    	    }


    	  private ScrollPane showEMails(Contact h){
    	        GridPane root = new GridPane();
    	        root.setHgap(5);
    	        root.setVgap(5);
    	        root.setPadding(new Insets(10, 10, 10, 10));
    	        int row = 0;

    	        ArrayList<String> EmailAdresse = h.geteMail();
    	        for (int i=0; i<h.geteMail().size(); i++) {
    	            String e = EmailAdresse.get(i);
    	            root.add(new Label(e), 1, row);

    	            row++;
    	        }
    	        ScrollPane pane = new ScrollPane();
    	        pane.setContent(root);
    	        return pane;
    	    }


    	    public static void main(String[] args) {
    	        launch(args);
    	    }


      }
