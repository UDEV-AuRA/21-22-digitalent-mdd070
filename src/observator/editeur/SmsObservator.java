package observator.editeur;

public class SmsObservator implements Observator {

    public void onSave() {
        SMSUtil.envoyerSms();
    }
}
