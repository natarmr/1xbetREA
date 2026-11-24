package a;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.zzaje;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.text.ParseException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class piw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27061a;
    public final String b;
    public final String c;
    public final long d;
    public final zzaje e;

    public piw0(String str, String str2, String str3, long j, zzaje zzajeVar) {
        if (!TextUtils.isEmpty(str) && zzajeVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            jf4.o("Cannot have both MFA phone_info and totp_info");
            throw null;
        }
        this.f27061a = str;
        s0x.E(str2);
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = zzajeVar;
    }

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        long jW;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strA = ktm0.a(jSONObject.optString("phoneInfo"));
            String strA2 = ktm0.a(jSONObject.optString("mfaEnrollmentId"));
            String strA3 = ktm0.a(jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME));
            String strOptString = jSONObject.optString("enrolledAt", "");
            try {
                glw0 glw0VarA = olw0.a(strOptString);
                olw0.b(glw0VarA);
                jW = glw0VarA.w();
            } catch (ParseException e) {
                Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + strOptString + Separators.DOUBLE_QUOTE, e);
                jW = 0;
            }
            piw0 piw0Var = new piw0(strA, strA2, strA3, jW, jSONObject.opt("totpInfo") != null ? new zzaje() : null);
            jSONObject.optString("unobfuscatedPhoneInfo");
            arrayList.add(piw0Var);
        }
        return arrayList;
    }
}
