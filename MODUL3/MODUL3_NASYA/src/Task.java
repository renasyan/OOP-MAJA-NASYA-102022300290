import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;
    private String title, priorty, status;
    public Task(LocalDate dueDate, String title, String priorty, String status) {
        this.dueDate = dueDate;
        this.title = title;
        this.priorty = priorty;
        this.status = status;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPriorty() {
        return priorty;
    }
    public void setPriorty(String priorty) {
        this.priorty = priorty;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // TO DO: Buat constructor untuk kelas Task

    // TO DO: Buat getter untuk title

    // TO DO: Buat getter untuk priority

    // TO DO: Buat getter untuk dueDate

    // TO DO: Buat getter untuk status
    
    // TO DO: Buat setter untuk status
    
}
