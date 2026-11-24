package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class np0 implements pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyl f23889a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;

    public np0(fyl fylVar, boolean z, String str, boolean z2, long j, int i) {
        boolean z3 = (i & 16) == 0;
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        j = (i & 64) != 0 ? s6t0.b().f33626a.getBackgroundContent() : j;
        str.getClass();
        this.f23889a = fylVar;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = secondary;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np0)) {
            return false;
        }
        np0 np0Var = (np0) obj;
        if (!this.f23889a.equals(np0Var.f23889a) || this.b != np0Var.b || !Intrinsics.d(this.c, np0Var.c) || this.d != np0Var.d || this.e != np0Var.e) {
            return false;
        }
        long j = np0Var.f;
        int i = y3d.h;
        return h2t0.a(this.f, j) && h2t0.a(this.g, np0Var.g);
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e(ua80.b(brm0.e(this.f23889a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.g) + rw2.b(iE, 31, this.f);
    }

    public final String toString() {
        String strI = y3d.i(this.f);
        String strI2 = y3d.i(this.g);
        StringBuilder sb = new StringBuilder("Content(model=");
        sb.append(this.f23889a);
        sb.append(", hasFilter=");
        sb.append(this.b);
        sb.append(", filterLabel=");
        brm0.C(this.c, ", isSelectedFilter=", ", isScrollToStartEnabled=", sb, this.d);
        f140.s(", buttonIconColor=", strI, ", buttonBackgroundColor=", sb, this.e);
        return axq.n(sb, strI2, Separators.RPAREN);
    }
}
