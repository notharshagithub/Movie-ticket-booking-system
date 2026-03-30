# Movie Ticket Booking System - Class Diagram

```mermaid
classDiagram

class Movie {
  String id
  String name
  int duration
}

class City {
  String name
}

class Theatre {
  String id
  String name
  City city
}

class Screen {
  String id
}

class Seat {
  String id
  SeatType type
}

class Show {
  String id
  Movie movie
  Screen screen
  LocalDateTime startTime
}

class Booking {
  String id
  Show show
  List~Seat~ seats
  BookingStatus status
}

class SeatLockService {
  lockSeats()
  confirmSeats()
  releaseSeats()
}

class BookingService {
  createBooking()
}

class PricingService {
  calculate()
}

class PaymentService {
  pay()
}

class PricingStrategy {
  <<interface>>
  calculatePrice()
}

class DefaultPricingStrategy {
}

class PaymentStrategy {
  <<interface>>
  pay()
}

class UPIPayment {
}

class CardPayment {
}

class PaymentFactory {
  getPayment()
}

class SearchService {
  <<interface>>
  getMoviesByCity()
  getTheatresByCity()
  getShowsByMovie()
}

%% Relationships

Theatre --> City
Theatre --> Screen
Screen --> Seat
Show --> Movie
Show --> Screen
Booking --> Show
Booking --> Seat

BookingService --> SeatLockService
BookingService --> PaymentService
BookingService --> PricingService

PricingService --> PricingStrategy
DefaultPricingStrategy ..|> PricingStrategy

PaymentService --> PaymentStrategy
UPIPayment ..|> PaymentStrategy
CardPayment ..|> PaymentStrategy
PaymentFactory --> PaymentStrategy

SearchService --> Movie
SearchService --> Theatre
SearchService --> Show
```
