package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class hhq0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f13078a;
    public final long b;
    public final long c;

    public hhq0(ygq0 ygq0Var, long j, long j2) {
        ygq0Var.getClass();
        this.f13078a = ygq0Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hhq0) {
            hhq0 hhq0Var = (hhq0) obj;
            return this.f13078a == hhq0Var.f13078a && this.b == hhq0Var.b && this.c == hhq0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f13078a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strG = ynq0.g(this.b);
        String strG2 = ynq0.g(this.c);
        StringBuilder sb = new StringBuilder("TimeFilterModel(timeFilter=");
        sb.append(this.f13078a);
        sb.append(", startTimestamp=");
        sb.append(strG);
        sb.append(", endTimestamp=");
        return axq.n(sb, strG2, Separators.RPAREN);
    }
}
