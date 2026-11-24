package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w3o implements x3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f38510a;
    public final long b;
    public final long c;

    public w3o(ygq0 ygq0Var, long j, long j2) {
        this.f38510a = ygq0Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3o)) {
            return false;
        }
        w3o w3oVar = (w3o) obj;
        return this.f38510a == w3oVar.f38510a && this.b == w3oVar.b && this.c == w3oVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f38510a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowTimeFilterDialog(timeFilter=");
        sb.append(this.f38510a);
        sb.append(", startTime=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", endTime=", Separators.RPAREN);
    }
}
