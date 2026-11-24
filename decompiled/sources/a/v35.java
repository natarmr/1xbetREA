package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class v35 implements ufw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36718a;
    public String b;
    public String c;
    public String d;

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f36718a);
        jSONObject.put(ParameterNames.PASSWORD, this.b);
        jSONObject.put("returnSecureToken", true);
        String str = this.c;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.d;
        if (str2 != null) {
            knm0.x(jSONObject, "captchaResponse", str2);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
