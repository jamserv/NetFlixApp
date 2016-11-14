/*
 * Copyright (C) 2015 janez
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package co.com.netflix.pattern.mvc.Entidades;

/**
 *
 * @author janez
 */
public class TarjetaCredito {

    private String numeroTarjetaCredito;
    private String fechaExpiracionTDC;
    private int codigoSeguridad;

    public TarjetaCredito() {
    }

    /**
     *
     * @param numeroTarjetaCredito
     * @param fechaExpiracionTDC
     * @param codigoSeguridad
     */
    public TarjetaCredito(String numeroTarjetaCredito, String fechaExpiracionTDC, int codigoSeguridad) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.fechaExpiracionTDC = fechaExpiracionTDC;
        this.codigoSeguridad = codigoSeguridad;
    }

    /**
     *
     * @return
     */
    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    /**
     *
     * @return
     */
    public String getFechaExpiracionTDC() {
        return fechaExpiracionTDC;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

}
