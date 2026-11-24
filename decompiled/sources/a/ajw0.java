package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ajw0 implements ufw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f998a;
    public String b;
    public String c;
    public String d;
    public String e;

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f998a;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put(ParameterNames.PASSWORD, str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            knm0.x(jSONObject, "captchaResponse", str4);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        String str5 = this.e;
        if (str5 != null) {
            jSONObject.put(CommonConstant.KEY_ID_TOKEN, str5);
        }
        return jSONObject.toString();
    }
}
