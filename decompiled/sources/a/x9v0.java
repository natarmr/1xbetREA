package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x9v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40528a;
    public final long b;
    public final csr c;
    public final ArrayList d;
    public final double e;
    public final long f;

    public x9v0(int i, long j, csr csrVar, ArrayList arrayList, double d, long j2) {
        this.f40528a = i;
        this.b = j;
        this.c = csrVar;
        this.d = arrayList;
        this.e = d;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9v0)) {
            return false;
        }
        x9v0 x9v0Var = (x9v0) obj;
        return this.f40528a == x9v0Var.f40528a && this.b == x9v0Var.b && Intrinsics.d(this.c, x9v0Var.c) && this.d.equals(x9v0Var.d) && Double.compare(this.e, x9v0Var.e) == 0 && this.f == x9v0Var.f;
    }

    public final int hashCode() {
        int iB = rw2.b(Integer.hashCode(this.f40528a) * 31, 31, this.b);
        csr csrVar = this.c;
        return Long.hashCode(this.f) + brm0.d(this.e, twn.g(this.d, (iB + (csrVar == null ? 0 : csrVar.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f40528a, this.b, "WheelInfo(freeSpinCounts=", ", freeSpinTimer=");
        sbQ.append(", winBonus=");
        sbQ.append(this.c);
        sbQ.append(", wheelSectors=");
        sbQ.append(this.d);
        ohs0.A(sbQ, this.e, ", balance=", ", accountId=");
        return brm0.k(this.f, Separators.RPAREN, sbQ);
    }
}
