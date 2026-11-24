package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vsf0 f12766a;
    public final i9e0 b;

    public hbe(vsf0 vsf0Var, i9e0 i9e0Var) {
        this.f12766a = vsf0Var;
        this.b = i9e0Var;
    }

    public static hbe a(hbe hbeVar, vsf0 vsf0Var, h9e0 h9e0Var, int i) {
        if ((i & 1) != 0) {
            vsf0Var = hbeVar.f12766a;
        }
        i9e0 i9e0Var = h9e0Var;
        if ((i & 2) != 0) {
            i9e0Var = hbeVar.b;
        }
        hbeVar.getClass();
        return new hbe(vsf0Var, i9e0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbe)) {
            return false;
        }
        hbe hbeVar = (hbe) obj;
        return this.f12766a == hbeVar.f12766a && this.b.equals(hbeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12766a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowData(resolved=" + this.f12766a + ", rating=" + this.b + Separators.RPAREN;
    }
}
