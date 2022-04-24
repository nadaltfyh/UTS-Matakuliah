package id.ac.uin.kelompok5.matakuliah.service;

import id.ac.uin.kelompok5.matakuliah.entity.Matakuliah;

import java.util.List;
import java.util.Optional;

public interface MatakuliahService {
    List<Matakuliah> getAllMatakuliah();

    Optional<Matakuliah> findById(Long id);

    Optional<Matakuliah> findByEmail(String email);

    Matakuliah save(Matakuliah std);

    void deleteById(Long id);
}
