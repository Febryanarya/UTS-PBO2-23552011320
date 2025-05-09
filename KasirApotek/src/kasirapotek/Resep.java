package kasirapotek;
import java.util.Date;

public class Resep {
    private int id;
    private int pasienId;
    private int dokterId;
    private Date tanggal;

    public Resep(int id, int pasienId, int dokterId, Date tanggal) {
        this.id = id;
        this.pasienId = pasienId;
        this.dokterId = dokterId;
        this.tanggal = tanggal;
    }
}
