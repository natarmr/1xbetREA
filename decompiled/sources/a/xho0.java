package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xho0 implements zho0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e140 f40904a;
    public final int b;
    public final boolean c;

    public xho0(e140 e140Var, int i, boolean z) {
        this.f40904a = e140Var;
        this.b = i;
        this.c = z;
    }

    public static xho0 a(xho0 xho0Var, e140 e140Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            e140Var = xho0Var.f40904a;
        }
        if ((i2 & 2) != 0) {
            i = xho0Var.b;
        }
        return new xho0(e140Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xho0)) {
            return false;
        }
        xho0 xho0Var = (xho0) obj;
        return this.f40904a.equals(xho0Var.f40904a) && this.b == xho0Var.b && this.c == xho0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f40904a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(styledTabs=");
        sb.append(this.f40904a);
        sb.append(", currentPosition=");
        sb.append(this.b);
        sb.append(", changeTabWithoutAnimation=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
