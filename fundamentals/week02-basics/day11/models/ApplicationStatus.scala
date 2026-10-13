package models

sealed trait ApplicationStatus

object ApplicationStatus {
  case object Submitted extends ApplicationStatus
  case object UnderReview extends ApplicationStatus
  case object Approved extends ApplicationStatus
  case object Rejected extends ApplicationStatus
}
