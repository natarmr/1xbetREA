package a;

import com.google.firebase.auth.zzao;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yhw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nmt0 f42657a;

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        nmt0 nmt0Var;
        biw0 biw0Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    nmt0Var = new nmt0(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z = false;
                    int i = 0;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        if (jSONObject2 == null) {
                            biw0Var = new biw0();
                            biw0Var.f = new owp0((byte) 22);
                            ejw0 ejw0Var = hhw0.e;
                            biw0Var.m = ulw0.h;
                        } else {
                            String strA = ktm0.a(jSONObject2.optString("localId", null));
                            String strA2 = ktm0.a(jSONObject2.optString("email", null));
                            boolean zOptBoolean = jSONObject2.optBoolean("emailVerified", z);
                            String strA3 = ktm0.a(jSONObject2.optString(CommonConstant.KEY_DISPLAY_NAME, null));
                            String strA4 = ktm0.a(jSONObject2.optString("photoUrl", null));
                            owp0 owp0VarJ = owp0.j(jSONObject2.optJSONArray("providerUserInfo"));
                            ktm0.a(jSONObject2.optString("rawPassword", null));
                            biw0Var = new biw0(strA, strA2, zOptBoolean, strA3, strA4, owp0VarJ, ktm0.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), piw0.a(jSONObject2.optJSONArray("mfaInfo")), zzao.m(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(biw0Var);
                        i++;
                        jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                        z = false;
                    }
                    nmt0Var = new nmt0(arrayList);
                }
            } else {
                nmt0Var = new nmt0();
                nmt0Var.f23789a = new ArrayList();
            }
            this.f42657a = nmt0Var;
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw knm0.w(e, "yhw0", str);
        } catch (JSONException e2) {
            e = e2;
            throw knm0.w(e, "yhw0", str);
        }
    }
}
