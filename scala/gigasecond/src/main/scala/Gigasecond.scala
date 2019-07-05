import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit


object Gigasecond {
  def add(startDate: LocalDate): LocalDateTime = add(startDate.atStartOfDay())

  def add(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(1000000000)
}
