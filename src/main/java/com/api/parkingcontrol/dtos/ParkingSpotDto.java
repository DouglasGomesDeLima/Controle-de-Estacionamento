package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
    @NotBlank
    private String ParkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String responsibleNome;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    /**
     * @return String return the ParkingSpotNumber
     */
    public String getParkingSpotNumber() {
        return ParkingSpotNumber;
    }

    /**
     * @param ParkingSpotNumber the ParkingSpotNumber to set
     */
    public void setParkingSpotNumber(String ParkingSpotNumber) {
        this.ParkingSpotNumber = ParkingSpotNumber;
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

    public Object getApartmentAndBlock() {
        return null;
    }

}
