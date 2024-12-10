import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainAppController {


    public String Status, Title, Priority;
    public LocalDate DueDate;


    @FXML
    private TableView<Task> taskTable; // Tabel untuk menampilkan daftar tugas
    @FXML
    private TableColumn<Task, String> titleCol, priorityCol, statusCol; // Kolom untuk judul, prioritas, dan status tugas
    @FXML
    private TableColumn<Task, LocalDate> dueDateCol; // Kolom untuk tanggal jatuh tempo
    @FXML
    private TextField titleField; // Field untuk memasukkan judul tugas
    @FXML
    private ComboBox<String> priorityBox; // ComboBox untuk memilih prioritas
    @FXML
    private DatePicker dueDatePicker; // DatePicker untuk memilih tanggal jatuh tempo

    private ObservableList<Task> taskList; // Daftar tugas yang dapat diamati
    

    @FXML
    public void initialize() {
        taskList = FXCollections.observableArrayList(TaskFileManager.loadTasks());

        // TODO: konfigurasi kolom tabel untuk setiap atribut task
        // hint: gunakan setCellValueFactory dan PropertyValueFactory
        priorityBox.setValue("null");
        titleCol.setCellValueFactory(new PropertyValueFactory<Task, String>("title"));
        priorityCol.setCellValueFactory(new PropertyValueFactory<Task, String>("priorty"));
        statusCol.setCellValueFactory(new PropertyValueFactory<Task, String>("status"));
        dueDateCol.setCellValueFactory(new PropertyValueFactory<Task, LocalDate>("dueDate"));

        taskTable.setItems(taskList);

        // TODO: konfigurasi lebar kolom agar lebih rapi
        // hint: gunakan setPrefWidth

        taskTable.setItems(taskList);

        // TODO: Tambahkan options prioritas ke ComboBox
        priorityBox.getItems().addAll("High", "Medium", "Low");
    }

    @FXML
    private void addTask() {
        try {
        
            if (titleField.getText().isEmpty() || priorityBox.getValue() == null || dueDatePicker.getValue() == null) {
                // TODO: Throw new MissingFieldException dengan pesan yang sesuai
                throw new MissingFieldException("Terdapat data yang masih kosong, silahkan isi");
            }

            if (dueDatePicker.getValue().isBefore(LocalDate.now())) {
                // TODO: Throw new InvalidDateException dengan pesan yang sesuai 
                throw new InvalidDateException("Tanggal tidak valid");
            }
            
            // TODO: Buat objek task baru dengan value dari field pada form
            // hint: gunakan getText() untuk TextField, getValue() untuk ComboBox, dan DatePicker, serta masukkan status "Incomplete" secara default
            Title = titleField.getText();
            Priority = priorityBox.getValue();
            DueDate = dueDatePicker.getValue();
            Status = "incomplete";

            System.out.println(Priority);
            System.out.println(DueDate);

            Task task = new Task(DueDate, Title, Priority, Status);
            System.out.println(DueDate +" "+ Priority+" " + Title+" " + Status);
            // TODO: Tambahkan objek task yang telah dibuat ke taskList
            // hint: gunakan function bawaan dari ObservableList, yaitu add
            taskList.add(task);

            clearData();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }
        
        // Contoh catch MissingFieldException dan InvalidDateException
        catch (MissingFieldException | InvalidDateException e) {
            showError(e.getMessage());
        }

    }

    // TODO: hapus semua value dari field pada form
    // hint: gunakan function getSelectionModel().clearSelection() untuk ComboBox dan getEditor().clear() untuk DatePicker
    private void clearData(){
        titleField.clear();
        priorityBox.setValue("");
        
        dueDatePicker.getEditor().clear();

    }

    @FXML
    private void deleteTask() throws MainAppController.TaskNotSelectedException {
        try {
    
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException dengan pesan yang sesuai 
                throw new TaskNotSelectedException("Silahkan isi data terlebih dahulu");
                
            }
            for (Task i : taskList){
                if(i.getTitle().equals(selected.getTitle())){
                    taskList.remove(i);
                    break;
                }
            }            
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        } catch (TaskNotSelectedException e){
            // TODO: Catch TaskNotSelectedException dan panggil showError (Lihat contoh catch)
            System.out.println(e);
        }
    }

    @FXML
    private void markTaskComplete() {

        int index = 0;
        try {
            Task selected = taskTable.getSelectionModel().getSelectedItem();
            if (selected == null) {
                // TODO: Throw new TaskNotSelectedException dengan pesan yang sesuai 
                throw new TaskNotSelectedException("Silahkan isi data terlebih dahulu");
            }
            // TODO: Ubah status task menjadi "Complete"
            
            // Task task = new Task(DueDate, Title, Priority, Status);
            // hint: gunakan function setStatus dari kelas Task
            for (Task i : taskList){
                System.out.println(i.getTitle());
                System.out.println(selected.getTitle());
                if(i.getTitle().equals(selected.getTitle())){
                    
                    i.setStatus("Complete");
                }
            }

            taskTable.refresh();
            TaskFileManager.saveTasks(new ArrayList<>(taskList));
        }catch (TaskNotSelectedException e){
            // TODO: Catch TaskNotSelectedException dan panggil showError (Lihat contoh catch)
            System.out.println(e);
        }

        // TODO: Catch TaskNotSelectedException dan panggil showError sekali lagi
        

    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message, ButtonType.OK);
        alert.showAndWait();
    }




    // TODO: Buat kelas MissingFieldException
    public static class MissingFieldException extends Exception {
        public MissingFieldException(String msg){
            super(msg);
        }
        
    }

    // TODO: Buat kelas TaskNotSelectedException
    public static class TaskNotSelectedException extends Exception {
        public TaskNotSelectedException(String msg){
            super(msg);
        }
        
    }
    
    // TODO: Buat kelas InvalidDateException
    public static class InvalidDateException extends Exception {
        public InvalidDateException(String msg){
            super(msg);
        }
        
    }

    // TODO: Buat kelas MissingDateException
    public static class MissingDateException extends Exception {
        public MissingDateException(String msg){
            super(msg);
        }
        
    }

}