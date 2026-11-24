package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a2l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130a;
    public final long b;

    public a2l0(String str, long j) {
        str.getClass();
        this.f130a = str;
        this.b = j;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f130a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2l0)) {
            return false;
        }
        a2l0 a2l0Var = (a2l0) obj;
        if (!Intrinsics.d(this.f130a, a2l0Var.f130a)) {
            return false;
        }
        long j = a2l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f130a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Dynamic3Lines(titleText=", this.f130a, ", titleColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
