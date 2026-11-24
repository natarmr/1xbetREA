package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d2l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5362a;
    public final long b;

    public d2l0(String str, long j) {
        str.getClass();
        this.f5362a = str;
        this.b = j;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f5362a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2l0)) {
            return false;
        }
        d2l0 d2l0Var = (d2l0) obj;
        if (!Intrinsics.d(this.f5362a, d2l0Var.f5362a)) {
            return false;
        }
        long j = d2l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f5362a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Static1Line(titleText=", this.f5362a, ", titleColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
