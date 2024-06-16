package com.vagonka.DigitalPortfolioSystem.services.client;

import java.util.List;

import com.vagonka.DigitalPortfolioSystem.dto.AdDTO;
import com.vagonka.DigitalPortfolioSystem.dto.AdDetailsForClientDTO;
import com.vagonka.DigitalPortfolioSystem.dto.ReservationDTO;
import com.vagonka.DigitalPortfolioSystem.dto.ReviewDTO;

public interface ClientService {

    List<AdDTO> getAllAds();

    List<AdDTO> searchAdByName(String name);

    boolean bookService(ReservationDTO reservationDTO);

    AdDetailsForClientDTO getAdDetailsByAdId(Long adId);

    List<ReservationDTO> getAllBookingsByUserId(Long userId);

    Boolean giveReview(ReviewDTO reviewDTO);
}
