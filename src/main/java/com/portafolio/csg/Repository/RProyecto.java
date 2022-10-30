
package com.portafolio.csg.Repository;

import com.portafolio.csg.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer> {

    public Optional<Proyecto> findByNombreP(String nombreP);

    public boolean existsByNombreP(String nombreP);
}
