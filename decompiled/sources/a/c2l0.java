package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c2l0 implements f2l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3630a;
    public final long b;

    public c2l0(String str, long j) {
        str.getClass();
        this.f3630a = str;
        this.b = j;
    }

    @Override // a.f2l0
    public final String a() {
        return this.f3630a;
    }

    @Override // a.f2l0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2l0)) {
            return false;
        }
        c2l0 c2l0Var = (c2l0) obj;
        if (!Intrinsics.d(this.f3630a, c2l0Var.f3630a)) {
            return false;
        }
        long j = c2l0Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f3630a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("Dynamic3Lines(titleText=", this.f3630a, ", titleColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
