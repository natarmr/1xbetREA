package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class g8q0 {
    public static final g8q0 c = new g8q0(0L, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10879a;
    public final long b;

    public /* synthetic */ g8q0(long j, int i) {
        this(idm0.t(0), (i & 2) != 0 ? idm0.t(0) : j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8q0)) {
            return false;
        }
        g8q0 g8q0Var = (g8q0) obj;
        return daq0.a(this.f10879a, g8q0Var.f10879a) && daq0.a(this.b, g8q0Var.b);
    }

    public final int hashCode() {
        eaq0[] eaq0VarArr = daq0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f10879a) * 31);
    }

    public final String toString() {
        return b1j.k("TextIndent(firstLine=", daq0.f(this.f10879a), ", restLine=", daq0.f(this.b), Separators.RPAREN);
    }

    public g8q0(long j, long j2) {
        this.f10879a = j;
        this.b = j2;
    }
}
