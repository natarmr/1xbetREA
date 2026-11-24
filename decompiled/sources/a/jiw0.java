package a;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class jiw0 implements xfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16595a;
    public ulw0 b;

    public final boolean a() {
        s0x.E("EMAIL_PASSWORD_PROVIDER");
        ulw0 ulw0Var = this.b;
        String str = null;
        if (ulw0Var != null && !ulw0Var.isEmpty()) {
            ulw0 ulw0Var2 = this.b;
            int i = ulw0Var2.g;
            int i2 = 0;
            while (i2 < i) {
                Object obj = ulw0Var2.get(i2);
                i2++;
                bhw0 bhw0Var = (bhw0) obj;
                String str2 = bhw0Var.b;
                String str3 = bhw0Var.f2629a;
                if (str2 != null && str3 != null && str3.equals("EMAIL_PASSWORD_PROVIDER")) {
                    str = str2;
                    break;
                }
            }
        }
        return str != null && (str.equals("ENFORCE") || str.equals("AUDIT"));
    }

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        ulw0 ulw0Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16595a = ktm0.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    ejw0 ejw0Var = hhw0.e;
                    ulw0Var = ulw0.h;
                } else {
                    ejw0 ejw0Var2 = hhw0.e;
                    Object[] objArrCopyOf = new Object[4];
                    int i = 0;
                    int i2 = 0;
                    boolean z = false;
                    while (i < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        bhw0 bhw0Var = jSONObject2 == null ? new bhw0(null, null) : new bhw0(ktm0.a(jSONObject2.optString("provider")), ktm0.a(jSONObject2.optString("enforcementState")));
                        int iA = gnm0.A(objArrCopyOf.length, i2 + 1);
                        if (iA > objArrCopyOf.length || z) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iA);
                            z = false;
                        }
                        objArrCopyOf[i2] = bhw0Var;
                        i++;
                        i2++;
                    }
                    ulw0Var = i2 == 0 ? ulw0.h : new ulw0(i2, objArrCopyOf);
                }
                this.b = ulw0Var;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw knm0.w(e, "jiw0", str);
        } catch (JSONException e2) {
            e = e2;
            throw knm0.w(e, "jiw0", str);
        }
    }
}
