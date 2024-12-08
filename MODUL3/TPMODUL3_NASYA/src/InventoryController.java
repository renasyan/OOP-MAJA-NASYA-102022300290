import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    String artist, judul;
    int total, rent;


    @FXML
    private Button AddButton;

    @FXML
    private TextField ArtistTextField;

    @FXML
    private Button DeleteButton;

    @FXML
    private TextField JudulTextField;

    @FXML
    private Button RentButton;

    @FXML
    private TextField RentTextFiend;

    @FXML
    private TextField TotalTextField;

    @FXML
    private Button UpdateButton;

    @FXML
    private TableView<Album> tableBar;

    @FXML
    private TableColumn<Album, String> judulColumn;

    @FXML
    private TableColumn<Album, String> artistColumn;
    
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    
    @FXML
    private TableColumn<Album, Integer> rentColumn;

    ObservableList<Album> dataAlbum = FXCollections.observableArrayList();

    public void initialize(){
        try {
            System.out.println("[LOG] check Tableview: " + (tableBar != null));
            System.out.println("[LOG] check Column: " + (judulColumn != null));

            judulColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("albumName"));
            artistColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("artist"));
            totalColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("total"));
            rentColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("rent"));

            tableBar.setItems(dataAlbum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void add (ActionEvent event) throws IOException{

        try {
            artist = ArtistTextField.getText();
            judul = JudulTextField.getText();
            total = Integer.valueOf(TotalTextField.getText());
            rent = Integer.valueOf(RentTextFiend.getText());    
            // System.out.println(artist+ judul+ total+ rent);
            Album album = new Album(artist, judul, total, rent);
            dataAlbum.add(album);
            clear();
            System.out.println("[LOG] Added");
            
            Alert alert = new Alert(AlertType.INFORMATION);            
            alert.setTitle("Tambah Album");
            alert.setContentText("album" + judul + " berhasil ditambahkan!");
            alert.showAndWait();


        } catch (Exception e) {
            Alert alert = new Alert(AlertType.WARNING);            
            alert.setTitle("Kesalahan");
            alert.setContentText("Terdapat kesalahan pada data yang anda masukan, mohon diperiksa kembali.");
            alert.showAndWait();
            e.getStackTrace();
        }
        
    }

    @FXML
    void delete(ActionEvent event) {
        try {
            for ( Album i : dataAlbum){
                if(i.getAlbumName().equals(judul)){
                    // System.out.println("index = "+dataAlbum.indexOf(i));
                    // Album album = new Album(artist, judul, total, rent);
                    dataAlbum.remove(i);
                    clear();
            
                    Alert alert = new Alert(AlertType.INFORMATION);            
                    alert.setTitle("Hapus album");
                    alert.setContentText("album" + judul + " berhasil dihapus!");
                    alert.showAndWait();
        
                    break;
                }
                else{
                    System.out.println("[LOG] failed to pass");
                }       
            }
        } catch (Exception e) {
            e.getStackTrace();
            Alert alert = new Alert(AlertType.WARNING);            
            alert.setTitle("Kesalahan");
            alert.setContentText("Terdapat kesalahan pada data yang anda masukan, mohon diperiksa kembali.");
            alert.showAndWait();
            e.getStackTrace();
        }
            }

    @FXML
    void rent(ActionEvent event) {
        try {
            JudulTextField.setEditable(false);
            ArtistTextField.setEditable(false);
            TotalTextField.setEditable(false);
            JudulTextField.setEditable(false);

            artist = ArtistTextField.getText();
            judul = JudulTextField.getText();
            total = Integer.valueOf(TotalTextField.getText());
            rent = Integer.valueOf(RentTextFiend.getText());
            rent = rent + 1;
            total = total - 1;
            
            for ( Album i : dataAlbum){
                if(i.getAlbumName().equals(judul)){
                    // System.out.println("index = "+dataAlbum.indexOf(i));
                    Album album = new Album(artist, judul, total, rent);
                    dataAlbum.set(dataAlbum.indexOf(i), album);
                    clear();
            
                    Alert alert = new Alert(AlertType.INFORMATION);            
                    alert.setTitle("Rent album");
                    alert.setContentText("album" + judul + " berhasil disewa!");
                    alert.showAndWait();
        
                    break;
                }
                else{
                    System.out.println("[LOG] failed to pass");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    void update(ActionEvent event) {
        artist = ArtistTextField.getText();
        judul = JudulTextField.getText();
        total = Integer.valueOf(TotalTextField.getText());
        rent = Integer.valueOf(RentTextFiend.getText());
        JudulTextField.setEditable(false);

        try {
            // System.out.println("[LOG] passed");
            for ( Album i : dataAlbum){
                if(i.getAlbumName().equals(judul)){
                    Album album = new Album(artist, judul, total, rent);
                    dataAlbum.set(dataAlbum.indexOf(i), album);
                    clear();
            
                    Alert alert = new Alert(AlertType.INFORMATION);            
                    alert.setTitle("Edit album");
                    alert.setContentText("album" + judul + " berhasil diperbarui!");
                    alert.showAndWait();
        
                    break;
                }
                else{
                    System.out.println("[LOG] failed to pass");
                }
            }
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.WARNING);            
            alert.setTitle("Kesalahan");
            alert.setContentText("Terdapat kesalahan pada data yang anda masukan, mohon diperiksa kembali.");
            alert.showAndWait();
            e.getStackTrace();
        }
    }

    @FXML
    void show(MouseEvent event) {
        try {
            if(event.getClickCount() == 1){
                JudulTextField.setText(String.valueOf(tableBar.getSelectionModel().getSelectedItem().getAlbumName()));
                ArtistTextField.setText(String.valueOf(tableBar.getSelectionModel().getSelectedItem().getArtist()));
                RentTextFiend.setText(String.valueOf(tableBar.getSelectionModel().getSelectedItem().getRent()));
                TotalTextField.setText(String.valueOf(tableBar.getSelectionModel().getSelectedItem().getTotal()));
            }
        } catch (Exception e) {
            e.getStackTrace();
            
        }
    }

    public void clear(){
        JudulTextField.setText("");
        RentTextFiend.setText("");
        TotalTextField.setText("");
        ArtistTextField.setText("");                
        JudulTextField.setEditable(true);
        ArtistTextField.setEditable(true);
        TotalTextField.setEditable(true);
        JudulTextField.setEditable(true);
    }

}
