package a;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class hbb implements ufw0, mff0 {
    public static final hbb c;
    public static final hbb d;
    public static final hbb e;
    public static final hbb f;
    public static final hbb g;
    public static final hbb h;
    public static final hbb i;
    public static final hbb j;
    public static final hbb k;
    public static final hbb l;
    public static final hbb m;
    public static final hbb n;
    public static final hbb o;
    public static final hbb p;
    public static final hbb q;
    public static final hbb r;
    public static final hbb s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12761a;
    public final String b;

    static {
        byte b = 0;
        c = new hbb("TINK", b);
        d = new hbb("CRUNCHY", b);
        e = new hbb("NO_PREFIX", b);
        byte b2 = 1;
        f = new hbb("ENABLED", b2);
        g = new hbb("DISABLED", b2);
        h = new hbb("DESTROYED", b2);
        byte b3 = 2;
        i = new hbb("UNKNOWN_KEYMATERIAL", b3);
        j = new hbb("SYMMETRIC", b3);
        k = new hbb("ASYMMETRIC_PRIVATE", b3);
        l = new hbb("ASYMMETRIC_PUBLIC", b3);
        m = new hbb("REMOTE", b3);
        byte b4 = 3;
        n = new hbb("TINK", b4);
        o = new hbb("NO_PREFIX", b4);
        byte b5 = 4;
        p = new hbb("TINK", b5);
        q = new hbb("CRUNCHY", b5);
        r = new hbb("LEGACY", b5);
        s = new hbb("NO_PREFIX", b5);
    }

    public /* synthetic */ hbb(String str, byte b) {
        this.f12761a = b;
        this.b = str;
    }

    public static hbb a(fq80 fq80Var) {
        String str;
        fq80Var.N(2);
        int iZ = fq80Var.z();
        int i2 = iZ >> 1;
        byte b = 5;
        int iZ2 = ((fq80Var.z() >> 3) & 31) | ((iZ & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        String str2 = Separators.DOT;
        sb.append(i2 < 10 ? ".0" : Separators.DOT);
        sb.append(i2);
        if (iZ2 < 10) {
            str2 = ".0";
        }
        return new hbb(b1j.h(iZ2, str2, sb), b);
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        int i2 = tzw0.l;
        izw0 izw0Var = new izw0((TaskCompletionSource) obj2);
        h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
        Parcel parcelG = h0x0Var.G();
        wmw0.c(parcelG, izw0Var);
        parcelG.writeString(this.b);
        parcelG.writeString("");
        parcelG.writeString(null);
        h0x0Var.H(parcelG, 11);
    }

    public String toString() {
        byte b = this.f12761a;
        String str = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("tenantId", str);
        }
        if (!TextUtils.isEmpty("CLIENT_TYPE_ANDROID")) {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        if (!TextUtils.isEmpty("RECAPTCHA_ENTERPRISE")) {
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        }
        return jSONObject.toString();
    }
}
