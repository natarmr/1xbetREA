package a;

import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mjw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21916a;
    public String b;
    public long c;
    public ArrayList d;
    public String e;

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ktm0.a(jSONObject.optString("localId", null));
            ktm0.a(jSONObject.optString("email", null));
            ktm0.a(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME, null));
            this.f21916a = ktm0.a(jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null));
            ktm0.a(jSONObject.optString("photoUrl", null));
            this.b = ktm0.a(jSONObject.optString("refreshToken", null));
            this.c = jSONObject.optLong("expiresIn", 0L);
            this.d = piw0.a(jSONObject.optJSONArray("mfaInfo"));
            this.e = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "mjw0", str);
        }
    }
}
