package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s970 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lvl f31840a;
    public final lvl b;
    public final String c;
    public final long d;
    public final long e;

    public s970(lvl lvlVar, lvl lvlVar2, String str, long j, long j2) {
        ro8 ro8Var = ro8.f30824a;
        str.getClass();
        this.f31840a = lvlVar;
        this.b = lvlVar2;
        this.c = str;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s970)) {
            return false;
        }
        s970 s970Var = (s970) obj;
        if (!this.f31840a.equals(s970Var.f31840a) || !this.b.equals(s970Var.b) || !Intrinsics.d(this.c, s970Var.c)) {
            return false;
        }
        ro8 ro8Var = ro8.f30824a;
        long j = s970Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, s970Var.e);
    }

    public final int hashCode() {
        int iHashCode = (ro8.b.hashCode() + ua80.b((this.b.hashCode() + (this.f31840a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(iHashCode, 31, this.d);
    }

    public final String toString() {
        ro8 ro8Var = ro8.b;
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("Content(balanceItem=");
        sb.append(this.f31840a);
        sb.append(", winSumItem=");
        sb.append(this.b);
        sb.append(", bodyText=");
        sb.append(this.c);
        sb.append(", bodyTextStyle=");
        sb.append(ro8Var);
        sb.append(", bodyTextColor=");
        return ua80.m(sb, strI, ", bodyTextBgColor=", strI2, Separators.RPAREN);
    }
}
