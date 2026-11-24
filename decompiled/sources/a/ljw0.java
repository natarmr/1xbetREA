package a;

import android.text.TextUtils;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ljw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20172a;
    public String b;
    public String c;
    public long d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public ArrayList o;
    public String p;

    public final com.google.firebase.auth.zzc a() {
        if (TextUtils.isEmpty(this.i) && TextUtils.isEmpty(this.j)) {
            return null;
        }
        String str = this.f;
        String str2 = this.j;
        String str3 = this.i;
        String str4 = this.m;
        String str5 = this.k;
        s0x.F(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new com.google.firebase.auth.zzc(str, str2, str3, null, str4, str5, null);
        }
        jf4.o("Must specify an idToken or an accessToken.");
        return null;
    }

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f20172a = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.b = ktm0.a(jSONObject.optString(CommonConstant.KEY_ID_TOKEN, null));
            this.c = ktm0.a(jSONObject.optString("refreshToken", null));
            this.d = jSONObject.optLong("expiresIn", 0L);
            ktm0.a(jSONObject.optString("localId", null));
            this.e = ktm0.a(jSONObject.optString("email", null));
            ktm0.a(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME, null));
            ktm0.a(jSONObject.optString("photoUrl", null));
            this.f = ktm0.a(jSONObject.optString("providerId", null));
            this.g = ktm0.a(jSONObject.optString("rawUserInfo", null));
            this.h = jSONObject.optBoolean("isNewUser", false);
            this.i = jSONObject.optString("oauthAccessToken", null);
            this.j = jSONObject.optString("oauthIdToken", null);
            this.l = ktm0.a(jSONObject.optString("errorMessage", null));
            this.m = ktm0.a(jSONObject.optString("pendingToken", null));
            this.n = ktm0.a(jSONObject.optString("tenantId", null));
            this.o = piw0.a(jSONObject.optJSONArray("mfaInfo"));
            this.p = ktm0.a(jSONObject.optString("mfaPendingCredential", null));
            this.k = ktm0.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "ljw0", str);
        }
    }
}
