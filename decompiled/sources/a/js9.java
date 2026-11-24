package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class js9 implements ks9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17040a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final wui0 g;

    public js9(int i, long j, long j2, long j3, wui0 wui0Var, String str, String str2) {
        str.getClass();
        this.f17040a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = str2;
        this.g = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js9)) {
            return false;
        }
        js9 js9Var = (js9) obj;
        if (this.f17040a != js9Var.f17040a || this.b != js9Var.b) {
            return false;
        }
        long j = js9Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j) && h2t0.a(this.d, js9Var.d) && Intrinsics.d(this.e, js9Var.e) && this.f.equals(js9Var.f) && this.g == js9Var.g;
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Long.hashCode(this.f17040a) * 31, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.g.hashCode() + ua80.b(ua80.b(rw2.b(rw2.b(iA, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.c);
        String strI2 = y3d.i(this.d);
        StringBuilder sbQ = brm0.q(this.b, this.f17040a, "Simple(itemId=", ", iconRes=");
        f140.v(sbQ, ", iconTint=", strI, ", iconBackgroundTint=", strI2);
        f140.v(sbQ, ", title=", this.e, ", subtitle=", this.f);
        sbQ.append(", position=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
