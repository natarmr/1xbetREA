package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18854a;
    public final long b;
    public final String c;

    public kta0(long j, long j2, String str) {
        this.f18854a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kta0)) {
            return false;
        }
        kta0 kta0Var = (kta0) obj;
        return this.f18854a == kta0Var.f18854a && this.b == kta0Var.b && this.c.equals(kta0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f18854a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f18854a, "PolybetRuleModel(id=", ", languageId=");
        kng0.z(sbQ, this.b, ", text=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
