package a;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class acf {
    public static e0u a(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new d0u(str2, (byte) 4);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new d0u(str2, (byte) 1);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new b0u(str2);
            }
        }
        return new d0u(str2, (byte) 3);
    }

    public static void b(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
