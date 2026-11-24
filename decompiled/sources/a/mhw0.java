package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.firebase.auth.EmailAuthCredential;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mhw0 implements ufw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21818a;
    public final String b;
    public final EmailAuthCredential c;
    public final String d;
    public final String e;

    static {
        String simpleName = mhw0.class.getSimpleName();
        String[] strArr = new String[0];
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
        Object[] objArr = {simpleName, 23};
        if (!(simpleName.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        for (int i = 2; i <= 7 && !Log.isLoggable(simpleName, i); i++) {
        }
    }

    public mhw0(EmailAuthCredential emailAuthCredential, String str, String str2) {
        s0x.H(emailAuthCredential);
        this.c = emailAuthCredential;
        String str3 = emailAuthCredential.f45642a;
        s0x.E(str3);
        this.f21818a = str3;
        String str4 = emailAuthCredential.c;
        s0x.E(str4);
        this.b = str4;
        this.d = str;
        this.e = str2;
    }

    @Override // a.ufw0
    public final String zza() throws JSONException {
        ei eiVar;
        int i = ei.c;
        String str = this.b;
        s0x.E(str);
        try {
            eiVar = new ei(str);
        } catch (IllegalArgumentException unused) {
            eiVar = null;
        }
        String str2 = eiVar != null ? eiVar.f7832a : null;
        String str3 = eiVar != null ? eiVar.b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f21818a);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put(CommonConstant.KEY_ID_TOKEN, str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            knm0.x(jSONObject, "captchaResp", str5);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
