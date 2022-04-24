package id.ac.uin.kelompok5.matakuliah.exception;

public class MatakuliahNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String message;

    public MatakuliahNotFoundException(String message) {
        this.message = message;
    }
}