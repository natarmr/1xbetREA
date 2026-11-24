package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qp9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29104a;
    public final String b;
    public final long c;

    public qp9(String str, int i, long j) {
        this.f29104a = i;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp9)) {
            return false;
        }
        qp9 qp9Var = (qp9) obj;
        return this.f29104a == qp9Var.f29104a && this.b.equals(qp9Var.b) && this.c == qp9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(Integer.hashCode(this.f29104a) * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, vqd.r(this.f29104a, "CallbackClickModelContainer(gameId=", ", gameName=", this.b, ", giftId="));
    }
}
