package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class njw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23656a;
    public String b;
    public long c;
    public boolean d;
    public String e;
    public String f;

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f23656a = ktm0.a(jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null));
            this.b = ktm0.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            ktm0.a(jSONObject.optString("localId", null));
            this.d = jSONObject.optBoolean("isNewUser", false);
            this.e = ktm0.a(jSONObject.optString("temporaryProof", null));
            this.f = ktm0.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "njw0", str);
        }
    }
}
