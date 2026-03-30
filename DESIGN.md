# Movie Booking System Design

Entities:
Movie
City
Theatre -> Screen -> Seat
Show
Booking

Enums:
SeatType
SeatStatus
BookingStatus

Services:
SearchService
BookingService
SeatLockService
PricingService
PaymentService

Patterns:
Strategy (Pricing, Payment)
Factory (PaymentFactory)

Flow:
User -> Movie -> Show -> Seats -> Lock -> Payment -> Confirm

Constraints:
No double booking
Seat locking required
Pricing based on seat type
