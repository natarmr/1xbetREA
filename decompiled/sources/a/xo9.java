package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xo9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41204a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;

    public xo9(String str, String str2, String str3, String str4, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        this.f41204a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo9)) {
            return false;
        }
        xo9 xo9Var = (xo9) obj;
        return Intrinsics.d(this.f41204a, xo9Var.f41204a) && Intrinsics.d(this.b, xo9Var.b) && Intrinsics.d(this.c, xo9Var.c) && Intrinsics.d(this.d, xo9Var.d) && Intrinsics.d(this.e, xo9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f41204a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CallConfig(userName=", this.f41204a, ", displayName=", this.b, ", domain=");
        f140.v(sbN, this.c, ", domainAddress=", this.d, ", extraHeaders=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
