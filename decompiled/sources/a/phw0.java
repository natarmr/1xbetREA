package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class phw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27018a;
    public String b;
    public boolean c;
    public long d;
    public ArrayList e;
    public String f;

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", null);
            jSONObject.optString("email", null);
            this.f27018a = jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null);
            this.b = jSONObject.optString("refreshToken", null);
            this.c = jSONObject.optBoolean("isNewUser", false);
            this.d = jSONObject.optLong("expiresIn", 0L);
            this.e = piw0.a(jSONObject.optJSONArray("mfaInfo"));
            this.f = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "phw0", str);
        }
    }
}
