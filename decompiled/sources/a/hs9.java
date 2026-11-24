package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hs9 implements ks9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13569a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final wui0 i;

    public hs9(long j, int i, long j2, long j3, String str, String str2, String str3, boolean z, wui0 wui0Var) {
        str.getClass();
        str3.getClass();
        this.f13569a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs9)) {
            return false;
        }
        hs9 hs9Var = (hs9) obj;
        if (this.f13569a != hs9Var.f13569a || this.b != hs9Var.b) {
            return false;
        }
        long j = hs9Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, hs9Var.d) && Intrinsics.d(this.e, hs9Var.e) && this.f.equals(hs9Var.f) && Intrinsics.d(this.g, hs9Var.g) && this.h == hs9Var.h && this.i == hs9Var.i;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f13569a) * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        StringBuilder sbQ = brm0.q(this.b, this.f13569a, "Extended(itemId=", ", iconRes=");
        f140.v(sbQ, ", iconTint=", strI, ", iconBackgroundTint=", strI2);
        f140.v(sbQ, ", title=", this.e, ", subtitle=", this.f);
        w6x.z(", caption=", this.g, ", isCancelVisible=", sbQ, this.h);
        sbQ.append(", position=");
        sbQ.append(this.i);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
