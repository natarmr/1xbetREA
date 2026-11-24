package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class q560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28135a;
    public final boolean b;
    public final String c;
    public final Map d;
    public final boolean e;

    public q560(String str, Map map, boolean z, boolean z2, boolean z3) {
        this.f28135a = z;
        this.b = z2;
        this.c = str;
        this.d = map;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q560)) {
            return false;
        }
        q560 q560Var = (q560) obj;
        return this.f28135a == q560Var.f28135a && this.b == q560Var.b && this.c.equals(q560Var.c) && this.d.equals(q560Var.d) && this.e == q560Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ohs0.f(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f28135a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NomaPayUiState(isLoading=", ", isRetryRequestsAvailable=", ", url=", this.f28135a, this.b);
        sbQ.append(this.c);
        sbQ.append(", headers=");
        sbQ.append(this.d);
        sbQ.append(", debugAllowed=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
