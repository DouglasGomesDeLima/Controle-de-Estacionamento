package com.api.parkingcontrol.models;

import java.io.Serializable; //só importei esse aqui
//import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false, length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationeDate;

    @Column(nullable = false, length = 130)
    private String responsibleNome;

    @Column(nullable = false, length = 30)
    private String apartment;

    @Column(nullable = false, length = 30)
    private String block;

    /*
     * private String nome;
     * private BigDecimal quantidade;
     * private BigDecimal valor;
     * 
     * // e defini o construtor aqui!
     * public ParkingSpotModel() {
     * 
     * }
     * 
     * @Id
     * 
     * @GeneratedValue(strategy = GenerationType.AUTO)
     * 
     * 
     * 
     * @Column(name = "nome", nullable = false)
     * public String getNome() {
     * return nome;
     * }
     * 
     * public void setNome(String nome) {
     * this.nome = nome;
     * }
     * 
     * @Column(name = "quantidade", nullable = false)
     * public BigDecimal getQuantidade() {
     * return quantidade;
     * }
     * 
     * public void setQuantidade(BigDecimal quantidade) {
     * this.quantidade = quantidade;
     * }
     * 
     * @Column(name = "valor", nullable = false)
     * public BigDecimal getValor() {
     * return valor;
     * }
     * 
     * public void setValor(BigDecimal valor) {
     * this.valor = valor;
     */
    /**
     * @return UUID return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return String return the parkingSpotNumber
     */
    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    /**
     * @param parkingSpotNumber the parkingSpotNumber to set
     */
    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    /**
     * @return String return the licensePlateCar
     */
    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    /**
     * @param licensePlateCar the licensePlateCar to set
     */
    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    /**
     * @return String return the brandCar
     */
    public String getBrandCar() {
        return brandCar;
    }

    /**
     * @param brandCar the brandCar to set
     */
    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    /**
     * @return String return the modelCar
     */
    public String getModelCar() {
        return modelCar;
    }

    /**
     * @param modelCar the modelCar to set
     */
    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    /**
     * @return String return the colorCar
     */
    public String getColorCar() {
        return colorCar;
    }

    /**
     * @param colorCar the colorCar to set
     */
    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    /**
     * @return LocalDateTime return the registrationeDate
     */
    public LocalDateTime getRegistrationeDate() {
        return registrationeDate;
    }

    /**
     * @param registrationeDate the registrationeDate to set
     */
    public void setRegistrationeDate(LocalDateTime registrationeDate) {
        this.registrationeDate = registrationeDate;
    }

    /**
     * @return String return the responsibleNome
     */
    public String getResponsibleNome() {
        return responsibleNome;
    }

    /**
     * @param responsibleNome the responsibleNome to set
     */
    public void setResponsibleNome(String responsibleNome) {
        this.responsibleNome = responsibleNome;
    }

    /**
     * @return String return the apartment
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * @param apartment the apartment to set
     */
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    /**
     * @return String return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(String block) {
        this.block = block;
    }

}
