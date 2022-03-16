package br.com.letscode.rebels.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.letscode.rebels.entity.RebeldeEntity;
=======
import br.com.letscode.rebels.model.RebeldeEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RebeldeRepository {

    private static List<RebeldeEntity> rebeldes = new ArrayList<RebeldeEntity>();

    // TODO(Bernardo): Rebeldes temporários para teste
    static {
        rebeldes.addAll(Arrays.asList(
                RebeldeEntity.builder()
                        .nome("Rebelde1")
                        .idade(42)
                        .genero('M')
                        .lat(21.334)
                        .lon(63.846)
                        .nomeBase("Echo")
                        .build(),
                RebeldeEntity.builder()
                        .nome("Rebelde2")
                        .idade(38)
                        .genero('F')
                        .lat(24.473)
                        .lon(54.972)
                        .nomeBase("Echo 3-T-8")
                        .build()
        ));
    }

    public static List<RebeldeEntity> getAll() {
        return rebeldes;
    }

    public static void save(RebeldeEntity entity) {
        rebeldes.add(entity);
    }
>>>>>>> 77176ee0a9a6a562b251cb210b22d1285b9b2b1e

public interface RebeldeRepository extends JpaRepository<RebeldeEntity, String> {


}