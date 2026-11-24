package a;

import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class m60 implements xfw0 {
    public static final m60 c;
    public static final m60 d;
    public static final m60 e;
    public static final m60 f;
    public static final m60 g;
    public static final m60 h;
    public static final m60 i;
    public static final m60 j;
    public static final m60 k;
    public static final m60 l;
    public static final m60 m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21242a;
    public String b;

    static {
        byte b = 0;
        c = new m60("TINK", b);
        d = new m60("CRUNCHY", b);
        e = new m60("NO_PREFIX", b);
        byte b2 = 1;
        f = new m60("FLAT", b2);
        g = new m60("HALF_OPENED", b2);
        byte b3 = 2;
        h = new m60("TINK", b3);
        i = new m60("CRUNCHY", b3);
        j = new m60("NO_PREFIX", b3);
        byte b4 = 3;
        k = new m60("TINK", b4);
        l = new m60("CRUNCHY", b4);
        m = new m60("NO_PREFIX", b4);
    }

    public /* synthetic */ m60(String str, byte b) {
        this.f21242a = b;
        this.b = str;
    }

    public yty a(kzv kzvVar, double d2, String str) {
        String str2 = this.b;
        str.getClass();
        i0w i0wVar = kzvVar.g;
        q4f q4fVar = kzvVar.b;
        i0w i0wVar2 = i0w.b;
        if (i0wVar == i0wVar2 && (q4fVar == q4f.k || q4fVar == q4f.j)) {
            pz40 pz40Var = s6t0.f31722a;
            return new wty(str, str2, s6t0.b().f33626a.getTextPrimary());
        }
        if (i0wVar == i0wVar2 && q3d.j(q4f.e, q4f.g).contains(q4fVar)) {
            pn40 pn40Var = pn40.f27267a;
            String strC = pn40.c(kzvVar.f, p3u0.c);
            pz40 pz40Var2 = s6t0.f31722a;
            return new wty(strC, str2, s6t0.b().f33626a.getTextPrimary());
        }
        if (d2 != 0.0d && i0wVar == i0wVar2) {
            pn40 pn40Var2 = pn40.f27267a;
            String strC2 = pn40.c(d2, p3u0.c);
            pz40 pz40Var3 = s6t0.f31722a;
            return new xty(s6t0.b().f33626a.getSecondary(), strC2, str, str2);
        }
        if (d2 != 0.0d && i0wVar == i0w.i) {
            pn40 pn40Var3 = pn40.f27267a;
            String strC3 = pn40.c(d2, p3u0.c);
            pz40 pz40Var4 = s6t0.f31722a;
            return new wty(strC3, str2, s6t0.b().f33626a.getTextPrimary());
        }
        if (d2 == 0.0d) {
            pz40 pz40Var5 = s6t0.f31722a;
            return new wty(str, str2, s6t0.b().f33626a.getTextPrimary());
        }
        y3d y3dVarJ = plc.J(i0wVar);
        if (y3dVarJ == null) {
            pz40 pz40Var6 = s6t0.f31722a;
            return new wty(str, str2, s6t0.b().f33626a.getTextPrimary());
        }
        long j2 = y3dVarJ.f41946a;
        pn40 pn40Var4 = pn40.f27267a;
        return new xty(j2, pn40.c(d2, p3u0.c), str, str2);
    }

    public String toString() {
        switch (this.f21242a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // a.xfw0
    public xfw0 zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.b = jSONObject.getString(CrashHianalyticsData.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e2) {
            Log.e("a.m60", "Failed to parse error for string [" + str + "] with exception: " + e2.getMessage());
            throw new udw0(kng0.l("Failed to parse error for string [", str, "]"), e2);
        }
    }

    public /* synthetic */ m60() {
        this.f21242a = (byte) 5;
    }
}
