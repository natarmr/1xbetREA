package a;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lsj implements ufw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20581a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty((String) this.e)) {
            jSONObject.put("sessionInfo", (String) this.c);
            jSONObject.put("code", (String) this.d);
        } else {
            jSONObject.put("phoneNumber", (String) this.b);
            jSONObject.put("temporaryProof", (String) this.e);
        }
        String str = (String) this.f;
        if (str != null) {
            jSONObject.put(CommonConstant.KEY_ID_TOKEN, str);
        }
        if (!this.f20581a) {
            jSONObject.put("operation", 2);
        }
        String str2 = (String) this.g;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
