package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15763a;
    public final dx7 b;
    public final long c;

    public j230(long j, dx7 dx7Var, long j2) {
        dx7Var.getClass();
        this.f15763a = j;
        this.b = dx7Var;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j230)) {
            return false;
        }
        j230 j230Var = (j230) obj;
        return this.f15763a == j230Var.f15763a && Intrinsics.d(this.b, j230Var.b) && this.c == j230Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.f15763a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnSubGameMarketsLoaded(subGameId=");
        sb.append(this.f15763a);
        sb.append(", markets=");
        sb.append(this.b);
        return rw2.n(sb, this.c, ", marketTypeId=", Separators.RPAREN);
    }
}
