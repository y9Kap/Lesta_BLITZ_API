package exception

public class BlitzRequestLimitExceededException(
    cause: Throwable? = null
) : BlitzResponseException(
    code = CODE,
    message = MESSAGE,
    cause = cause
) {
    public companion object {
        public const val CODE: Int = 407
        public const val MESSAGE: String = "REQUEST_LIMIT_EXCEEDED"
    }
}
