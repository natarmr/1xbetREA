package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15688a;
    public final long b;
    public final o0x c;
    public final long d;
    public final int e;
    public final i0m f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0m(String str, o0x o0xVar, long j, int i, i0m i0mVar, int i2) {
        this(str, s6t0.b().f33626a.getTextPrimary(), o0xVar, j, i, (i2 & 32) != 0 ? h0m.f12242a : i0mVar);
        pz40 pz40Var = s6t0.f31722a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0m)) {
            return false;
        }
        j0m j0mVar = (j0m) obj;
        if (!Intrinsics.d(this.f15688a, j0mVar.f15688a)) {
            return false;
        }
        long j = j0mVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, j0mVar.c) && h2t0.a(this.d, j0mVar.d) && this.e == j0mVar.e && Intrinsics.d(this.f, j0mVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f15688a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + twn.a(this.e, rw2.b(w6x.d(this.c, rw2.b(iHashCode, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        String strI2 = y3d.i(this.d);
        StringBuilder sbN = b1j.n("IconWithTitle(title=", this.f15688a, ", titleTint=", strI, ", imageLink=");
        sbN.append(this.c);
        sbN.append(", iconTint=");
        sbN.append(strI2);
        sbN.append(", iconPlaceholder=");
        sbN.append(this.e);
        sbN.append(", badge=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }

    public j0m(String str, long j, o0x o0xVar, long j2, int i, i0m i0mVar) {
        str.getClass();
        i0mVar.getClass();
        this.f15688a = str;
        this.b = j;
        this.c = o0xVar;
        this.d = j2;
        this.e = i;
        this.f = i0mVar;
    }
}
