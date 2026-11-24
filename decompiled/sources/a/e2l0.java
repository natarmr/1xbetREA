package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e2l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7093a;
    public final long b;

    public e2l0(String str, long j) {
        str.getClass();
        this.f7093a = str;
        this.b = j;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f7093a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2l0)) {
            return false;
        }
        e2l0 e2l0Var = (e2l0) obj;
        if (!Intrinsics.d(this.f7093a, e2l0Var.f7093a)) {
            return false;
        }
        long j = e2l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f7093a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Static3Lines(titleText=", this.f7093a, ", titleColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
