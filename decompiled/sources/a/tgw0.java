package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class tgw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f33935a;

    static {
        Pattern.compile("(?<!\\d)\\d{6}(?!\\d)");
        String[] strArr = {"SmsRetrieverHelper"};
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(Separators.COMMA);
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i = 2; i <= 7 && !Log.isLoggable("FirebaseAuth", i); i++) {
        }
    }

    public tgw0(ScheduledExecutorService scheduledExecutorService) {
        new HashMap();
        this.f33935a = scheduledExecutorService;
    }
}
