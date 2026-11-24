package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33373a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public t5k0(String str, String str2, String str3, String str4, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        this.f33373a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5k0)) {
            return false;
        }
        t5k0 t5k0Var = (t5k0) obj;
        return Intrinsics.d(this.f33373a, t5k0Var.f33373a) && Intrinsics.d(this.b, t5k0Var.b) && Intrinsics.d(this.c, t5k0Var.c) && Intrinsics.d(this.d, t5k0Var.d) && Intrinsics.d(this.e, t5k0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f33373a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SipCallConfig(userName=", this.f33373a, ", displayName=", this.b, ", domain=");
        f140.v(sbN, this.c, ", domainAddress=", this.d, ", extraHeaders=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
