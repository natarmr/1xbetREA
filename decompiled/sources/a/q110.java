package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q110 implements s110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27929a;
    public final String b;

    public q110(long j, String str) {
        this.f27929a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q110)) {
            return false;
        }
        q110 q110Var = (q110) obj;
        return this.f27929a == q110Var.f27929a && this.b.equals(q110Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f27929a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27929a, "InfoClick(champId=", ", champName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
