package ir.npraspina.smsverification.app;

/**
 * Created by mrzkhalifeh8 on 12/05/2018.
 */

public class Config {
    // server URL configuration
    public static final String URL_REQUEST_SMS = "http://192.168.1.4/server/request_sms.php";
    public static final String URL_VERIFY_OTP = "http://192.168.1.4/server/verify_otp.php";

    // SMS provider identification
    // It should match with your SMS gateway origin
    // You can use  MSGIND, TESTER and ALERTS as sender ID
    // If you want custom sender Id, approve service to get one
    public static final String SMS_ORIGIN = "YOUR-APP";

    // special character to prefix the otp. Make sure this character appears only once in the sms
    public static final String OTP_DELIMITER = ":";
}
