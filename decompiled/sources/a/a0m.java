package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0m implements b0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31a;
    public final long b;

    public a0m(String str, long j) {
        str.getClass();
        this.f31a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0m)) {
            return false;
        }
        a0m a0mVar = (a0m) obj;
        if (!Intrinsics.d(this.f31a, a0mVar.f31a)) {
            return false;
        }
        long j = a0mVar.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.f31a.hashCode() * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        return b1j.k("SubTitle(subTitle=", this.f31a, ", subTitleTint=", y3d.i(this.b), Separators.RPAREN);
    }
}
