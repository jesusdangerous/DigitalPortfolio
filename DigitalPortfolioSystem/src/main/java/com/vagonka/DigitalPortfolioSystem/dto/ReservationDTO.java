package com.vagonka.DigitalPortfolioSystem.dto;

import lombok.Data;

import java.util.Date;

import com.vagonka.DigitalPortfolioSystem.enums.ReservationStatus;
import com.vagonka.DigitalPortfolioSystem.enums.ReviewStatus;

@Data
public class ReservationDTO {

    private Long id;

    private Date bookDate;

    private String serviceName;

    private ReservationStatus reservationStatus;

    private ReviewStatus reviewStatus;

    private Long userId;

    private String userName;

    private Long companyId;

    private Long adId;

}
