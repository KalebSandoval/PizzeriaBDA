/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOs;

import java.time.LocalDate;

/**
 *
 * @author Brian
 */
public class PedidoDTO {

    /**
     * Nota adicional del pedido.
     */
    private String nota;

    /**
     * Estado actual del pedido (pendiente, en preparación, entregado, etc.).
     */
    private String estadoActual;

    /**
     * Fecha y hora en que se realizó el pedido.
     */
    private LocalDate fechaHoraPedido;

    /**
     * Fecha y hora programada para la entrega del pedido.
     */
    private LocalDate fechaHoraEntrega;

    /**
     * Constructor por omisión.
     */
    public PedidoDTO() {
    }

    /**
     * Constructor completo que incluye identificador.
     *
     * @param nota nota adicional
     * @param estadoActual estado actual del pedido
     * @param fechaHoraPedido fecha y hora del pedido
     * @param fechaHoraEntrega fecha y hora de entrega
     */
    public PedidoDTO(String nota, String estadoActual, LocalDate fechaHoraPedido, LocalDate fechaHoraEntrega) {
        this.nota = nota;
        this.estadoActual = estadoActual;
        this.fechaHoraPedido = fechaHoraPedido;
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    /**
     * @return nota del pedido
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota nueva nota
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return estado actual del pedido
     */
    public String getEstadoActual() {
        return estadoActual;
    }

    /**
     * @param estadoActual nuevo estado
     */
    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    /**
     * @return fecha y hora del pedido
     */
    public LocalDate getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    /**
     * @param fechaHoraPedido nueva fecha y hora del pedido
     */
    public void setFechaHoraPedido(LocalDate fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    /**
     * @return fecha y hora de entrega
     */
    public LocalDate getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    /**
     * @param fechaHoraEntrega nueva fecha y hora de entrega
     */
    public void setFechaHoraEntrega(LocalDate fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

}
