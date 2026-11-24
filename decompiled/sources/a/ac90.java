package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ac90 implements kc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f617a;
    public final long b;
    public final String c;

    public ac90(String str, int i, long j) {
        str.getClass();
        this.f617a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac90)) {
            return false;
        }
        ac90 ac90Var = (ac90) obj;
        if (this.f617a != ac90Var.f617a) {
            return false;
        }
        long j = ac90Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j) && Intrinsics.d(this.c, ac90Var.c);
    }

    @Override // a.kc90
    public final int getKey() {
        return this.f617a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f617a) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f617a, "PenaltyExpected(key=", ", textColor=", y3d.i(this.b), ", penaltyNumber="), this.c, Separators.RPAREN);
    }
}
