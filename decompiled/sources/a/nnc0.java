package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nnc0 implements onc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23814a;
    public final String b;
    public final String c;

    public nnc0(long j, String str, String str2) {
        this.f23814a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnc0)) {
            return false;
        }
        nnc0 nnc0Var = (nnc0) obj;
        return this.f23814a == nnc0Var.f23814a && this.b.equals(nnc0Var.b) && this.c.equals(nnc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f23814a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f23814a, "ShowSuccessSnackBar(balanceId=", ", totoTicket=", this.b), ", totoTypeName=", this.c, Separators.RPAREN);
    }
}
