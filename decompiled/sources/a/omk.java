package a;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omk extends c2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omk(String str, Bundle bundle, byte b) {
        super(bundle, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        switch (b) {
            case 1:
                super(bundle, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
                if (str.length() > 0) {
                    return;
                }
                jf4.o("password should not be empty");
                throw null;
            case 2:
                super(bundle, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                jf4.o("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                jf4.o("credentialJson must not be empty, and must be a valid JSON");
                throw null;
        }
    }
}
