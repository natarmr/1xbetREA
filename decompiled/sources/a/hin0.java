package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13122a;
    public final long b;
    public final boolean c;

    public hin0(int i, long j, boolean z) {
        this.f13122a = i;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hin0)) {
            return false;
        }
        hin0 hin0Var = (hin0) obj;
        return this.f13122a == hin0Var.f13122a && this.b == hin0Var.b && this.c == hin0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Integer.hashCode(this.f13122a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(vqd.q(this.f13122a, this.b, "SummonersTimer(timerIcon=", ", timeSeconds="), ", active=", this.c, Separators.RPAREN);
    }
}
