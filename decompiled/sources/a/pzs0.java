package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pzs0 implements zxs0 {
    public t3u0 a() {
        return t3u0.e;
    }

    public abstract wsy b();

    public boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzs0)) {
            return false;
        }
        pzs0 pzs0Var = (pzs0) obj;
        return c() == pzs0Var.c() && a() == pzs0Var.a() && b().equals(pzs0Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (e0t0.m(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return Separators.STAR;
        }
        if (a() == t3u0.c) {
            return b().toString();
        }
        return a() + Separators.SP + b();
    }

    public pzs0 d(cty ctyVar) {
        return this;
    }
}
