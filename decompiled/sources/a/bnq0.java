package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2897a;
    public final l7n b;
    public final boolean c;

    public bnq0(long j, l7n l7nVar, boolean z) {
        this.f2897a = j;
        this.b = l7nVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnq0)) {
            return false;
        }
        bnq0 bnq0Var = (bnq0) obj;
        return this.f2897a == bnq0Var.f2897a && this.b == bnq0Var.b && this.c == bnq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f2897a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimerModel(timeMillis=");
        sb.append(this.f2897a);
        sb.append(", timeDirection=");
        sb.append(this.b);
        return f140.n(sb, ", timeRun=", this.c, Separators.RPAREN);
    }
}
