package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ol50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25436a;
    public final long b;
    public final long c;
    public final al50 d;
    public final lmk0 e;
    public final Object f;

    public ol50(int i, long j, long j2, al50 al50Var, lmk0 lmk0Var, Object obj) {
        this.f25436a = i;
        this.b = j;
        this.c = j2;
        this.d = al50Var;
        this.e = lmk0Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol50)) {
            return false;
        }
        ol50 ol50Var = (ol50) obj;
        return this.f25436a == ol50Var.f25436a && this.b == ol50Var.b && this.c == ol50Var.c && Intrinsics.d(this.d, ol50Var.d) && Intrinsics.d(this.e, ol50Var.e) && Intrinsics.d(this.f, ol50Var.f);
    }

    public final int hashCode() {
        int iF = ohs0.f(this.d.f1052a, rw2.b(rw2.b(this.f25436a * 31, 31, this.b), 31, this.c), 31);
        lmk0 lmk0Var = this.e;
        int iHashCode = (iF + (lmk0Var == null ? 0 : lmk0Var.f20300a.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f25436a, this.b, "NetworkResponse(code=", ", requestMillis=");
        kng0.A(sbQ, ", responseMillis=", this.c, ", headers=");
        sbQ.append(this.d);
        sbQ.append(", body=");
        sbQ.append(this.e);
        sbQ.append(", delegate=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
