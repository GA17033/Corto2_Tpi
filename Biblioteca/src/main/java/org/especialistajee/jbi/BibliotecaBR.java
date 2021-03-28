/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.especialistajee.jbi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.especialistajee.jbib.model.AlumnoDomain;
import org.especialistajee.jbib.model.UsuarioDomain;

/**
 *
 * @author FUJITSU
 */
public class BibliotecaBR {

    private int numDiasPrestamoAlumno = 7;
    private int numDiasPrestamoProfesor = 30;
    private int cupoOperacionesAlumno = 5;
    private int cupoOperacionesProfesor = 8;
    private static Log logger = LogFactory.getLog(BibliotecaBR.class);

    private static BibliotecaBR me = new BibliotecaBR();

    private BibliotecaBR() {
        logger.debug("creada instancia de " + BibliotecaBR.class);
    }

    public static BibliotecaBR getInstance() {
        return me;
    }

    /**
     * Calcula el número de dias de plazo que tienen un usuario para realizar
     * una reserva (Socio = 5 , Profesor = 10)
     *
     * @param tipo tipo del usuario
     * @return número de dias de reserva
     * @throws BibliotecaException el tipo del usuario no es válido
     */
    public int calculaNumDiasReserva(UsuarioDomain usuario)
            throws BibliotecaException {

        if (usuario instanceof AlumnoDomain) {

            return numDiasPrestamoAlumno;
        } else if (usuario instanceof ProfesorDomain) {
            return numDiasPrestamoProfesor;
        } else {
            String msg = "solo los alumnos y profesores pueden";
            logger.error(msg);
            throw new BibliotecaException(msg);

        }
    }

    /**
     * Calcula el número de dias de plazo que tienen un usuario para realizar un
     * prestamo (Alumno = 7 , Profesor = 30)
     *
     * @param tipo tipo del usuario
     * @return número de dias del prestamo
     * @throws BibliotecaException el tipo del usuario no es válido
     */
    public int calculaNumDiasPrestamo(TipoUsuario tipo)
            throws BibliotecaException {

    }

    /**
     * Valida que el número de operaciones realizadas por un determinado tipo de
     * usuario se inferior al cupo definido
     *
     * @param tipo tipo del usuario
     * @param numOp número de operación que ya tiene realizadas
     * @throws BibliotecaException el cupo de operacion esta lleno, o el tipo
     * del usuario no es el esperado
     */
    public void compruebaCupoOperaciones(TipoUsuario tipo, int numOp)
            throws BibliotecaException {
// TODO Completar
    }

}
