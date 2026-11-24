package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ux30 implements wx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36422a;
    public final long b;
    public final String c;
    public final long d;

    /* JADX WARN: Illegal instructions before constructor call */
    public ux30(int i, long j, String str, String str2) {
        if ((i & 2) != 0) {
            pz40 pz40Var = s6t0.f31722a;
            j = s6t0.b().f33626a.getTextPrimary();
        }
        long j2 = j;
        str2 = (i & 4) != 0 ? null : str2;
        pz40 pz40Var2 = s6t0.f31722a;
        this(j2, s6t0.b().f33626a.getSecondary(), str, str2);
    }

    @Override // a.wx30
    public final long b() {
        return this.b;
    }

    @Override // a.wx30
    public final long c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux30)) {
            return false;
        }
        ux30 ux30Var = (ux30) obj;
        if (!Intrinsics.d(this.f36422a, ux30Var.f36422a)) {
            return false;
        }
        long j = ux30Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, ux30Var.c) && h2t0.a(this.d, ux30Var.d);
    }

    @Override // a.wx30
    public final String getSubTitle() {
        return this.c;
    }

    @Override // a.wx30
    public final String getTitle() {
        return this.f36422a;
    }

    public final int hashCode() {
        int iHashCode = this.f36422a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iB = rw2.b(iHashCode, 31, this.b);
        String str = this.c;
        return Long.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String strI = y3d.i(this.b);
        return ua80.m(b1j.n("Title(title=", this.f36422a, ", titleColor=", strI, ", subTitle="), this.c, ", subTitleColor=", y3d.i(this.d), Separators.RPAREN);
    }

    public ux30(long j, long j2, String str, String str2) {
        str.getClass();
        this.f36422a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
    }
}
