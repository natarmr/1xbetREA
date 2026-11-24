package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ziw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44458a;
    public String b;
    public long c;

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f44458a = ktm0.a(jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null));
            ktm0.a(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME, null));
            ktm0.a(jSONObject.optString("email", null));
            this.b = ktm0.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "ziw0", str);
        }
    }
}
