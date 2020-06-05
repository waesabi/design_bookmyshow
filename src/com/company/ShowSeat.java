package com.company;

public class ShowSeat extends CinemaHallSeat {
    private Double seatPrice;
    private SeatStatus seatStatus;

    public ShowSeat(Double seatPrice, SeatStatus seatStatus) {
        super();
        this.seatPrice = seatPrice;
        this.seatStatus = seatStatus;
    }

    public Double getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(Double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}

