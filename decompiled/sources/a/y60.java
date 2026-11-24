package a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class y60 implements ufw0 {
    public static final y60 c;
    public static final y60 d;
    public static final y60 e;
    public static final y60 f;
    public static final y60 g;
    public static final y60 h;
    public static final y60 i;
    public static final y60 j;
    public static final y60 k;
    public static final y60 l;
    public static final y60 m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42072a;
    public final String b;

    static {
        byte b = 0;
        c = new y60("TINK", b);
        d = new y60("CRUNCHY", b);
        e = new y60("NO_PREFIX", b);
        byte b2 = 1;
        f = new y60("FOLD", b2);
        g = new y60("HINGE", b2);
        byte b3 = 2;
        h = new y60("TINK", b3);
        i = new y60("CRUNCHY", b3);
        j = new y60("NO_PREFIX", b3);
        byte b4 = 3;
        k = new y60("TINK", b4);
        l = new y60("CRUNCHY", b4);
        m = new y60("NO_PREFIX", b4);
    }

    public y60(String str) {
        this.f42072a = (byte) 4;
        s0x.E(str);
        this.b = str;
    }

    public String toString() {
        byte b = this.f42072a;
        String str = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // a.ufw0
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", "refresh_token");
        jSONObject.put("refreshToken", this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ y60(String str, byte b) {
        this.f42072a = b;
        this.b = str;
    }
}
