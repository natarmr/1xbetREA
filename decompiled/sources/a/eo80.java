package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class eo80 implements f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8127a;
    public final int b;
    public final long c;
    public final g8q0 d;
    public final ew90 e;
    public final m600 f;
    public final int g;
    public final int h;
    public final i9q0 i;

    public eo80(int i, int i2, long j, g8q0 g8q0Var, ew90 ew90Var, m600 m600Var, int i3, int i4, i9q0 i9q0Var) {
        this.f8127a = i;
        this.b = i2;
        this.c = j;
        this.d = g8q0Var;
        this.e = ew90Var;
        this.f = m600Var;
        this.g = i3;
        this.h = i4;
        this.i = i9q0Var;
        eaq0[] eaq0VarArr = daq0.b;
        if (daq0.a(j, daq0.c)) {
            return;
        }
        if (daq0.c(j) >= 0.0f) {
            return;
        }
        ycx.b("lineHeight can't be negative (" + daq0.c(j) + Separators.RPAREN);
    }

    public final eo80 a(eo80 eo80Var) {
        return eo80Var == null ? this : fo80.a(this, eo80Var.f8127a, eo80Var.b, eo80Var.c, eo80Var.d, eo80Var.e, eo80Var.f, eo80Var.g, eo80Var.h, eo80Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo80)) {
            return false;
        }
        eo80 eo80Var = (eo80) obj;
        return this.f8127a == eo80Var.f8127a && this.b == eo80Var.b && daq0.a(this.c, eo80Var.c) && Intrinsics.d(this.d, eo80Var.d) && Intrinsics.d(this.e, eo80Var.e) && Intrinsics.d(this.f, eo80Var.f) && this.g == eo80Var.g && this.h == eo80Var.h && Intrinsics.d(this.i, eo80Var.i);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, Integer.hashCode(this.f8127a) * 31, 31);
        eaq0[] eaq0VarArr = daq0.b;
        int iB = rw2.b(iA, 31, this.c);
        g8q0 g8q0Var = this.d;
        int iHashCode = (iB + (g8q0Var != null ? g8q0Var.hashCode() : 0)) * 31;
        ew90 ew90Var = this.e;
        int iHashCode2 = (iHashCode + (ew90Var != null ? ew90Var.hashCode() : 0)) * 31;
        m600 m600Var = this.f;
        int iA2 = twn.a(this.h, twn.a(this.g, (iHashCode2 + (m600Var != null ? m600Var.hashCode() : 0)) * 31, 31), 31);
        i9q0 i9q0Var = this.i;
        return iA2 + (i9q0Var != null ? i9q0Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = f2q0.a(this.f8127a);
        String strA2 = n5q0.a(this.b);
        String strF = daq0.f(this.c);
        String strA3 = p500.a(this.g);
        String strA4 = fuw.a(this.h);
        StringBuilder sbN = b1j.n("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbN.append(strF);
        sbN.append(", textIndent=");
        sbN.append(this.d);
        sbN.append(", platformStyle=");
        sbN.append(this.e);
        sbN.append(", lineHeightStyle=");
        sbN.append(this.f);
        sbN.append(", lineBreak=");
        f140.v(sbN, strA3, ", hyphens=", strA4, ", textMotion=");
        sbN.append(this.i);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public eo80(int i, g8q0 g8q0Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 0, daq0.c, (i2 & 8) != 0 ? null : g8q0Var, null, null, 0, 0, null);
    }
}
