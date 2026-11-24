package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31735a;
    public final long b;
    public final boolean c;

    public s760(long j, boolean z, long j2) {
        this.f31735a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s760)) {
            return false;
        }
        s760 s760Var = (s760) obj;
        return this.f31735a == s760Var.f31735a && this.b == s760Var.b && this.c == s760Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f31735a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31735a, "NotificationPointModel(periodId=", ", eventId=");
        hne.t(this.b, ", subscribe=", sbQ, this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
