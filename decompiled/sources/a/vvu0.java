package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vvu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38121a;
    public final long b;
    public final long c;

    public vvu0(long j, long j2, String str) {
        this.f38121a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvu0)) {
            return false;
        }
        vvu0 vvu0Var = (vvu0) obj;
        return this.f38121a.equals(vvu0Var.f38121a) && this.b == vvu0Var.b && this.c == vvu0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f38121a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(f140.o(this.b, "WalletCreateResult(message=", this.f38121a, ", accountId="), this.c, ", errorCode=", Separators.RPAREN);
    }
}
