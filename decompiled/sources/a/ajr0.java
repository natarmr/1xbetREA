package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ajr0 implements bjr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f991a;
    public final String b;
    public final String c;

    public ajr0(long j, String str, String str2) {
        this.f991a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajr0)) {
            return false;
        }
        ajr0 ajr0Var = (ajr0) obj;
        return this.f991a == ajr0Var.f991a && this.b.equals(ajr0Var.b) && this.c.equals(ajr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f991a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f991a, "ShowSuccessSnackBar(balanceId=", ", totoTicket=", this.b), ", totoName=", this.c, Separators.RPAREN);
    }
}
