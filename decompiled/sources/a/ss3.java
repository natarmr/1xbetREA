package a;

import com.huawei.hms.adapter.internal.AvailableCode;

/* JADX INFO: loaded from: classes.dex */
public class ss3 extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss3(byte b) {
        super("Application не предоставлен");
        switch (b) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                super("Недостижимый метод");
                break;
            default:
                break;
        }
    }
}
