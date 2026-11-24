package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jnv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16830a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final long e;

    public jnv0(long j, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f16830a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = j;
    }

    public static jnv0 a(jnv0 jnv0Var, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 8) != 0) {
            list = jnv0Var.d;
        }
        List list2 = list;
        long j = jnv0Var.e;
        jnv0Var.getClass();
        list2.getClass();
        return new jnv0(j, list2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnv0)) {
            return false;
        }
        jnv0 jnv0Var = (jnv0) obj;
        return this.f16830a == jnv0Var.f16830a && this.b == jnv0Var.b && this.c == jnv0Var.c && Intrinsics.d(this.d, jnv0Var.d) && this.e == jnv0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f16830a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("WinterGamesResultsTableState(isLoading=", ", isError=", ", isEmpty=", this.f16830a, this.b);
        vqd.y(sbQ, ", winterGameResults=", this.d, ", sportId=", this.c);
        return brm0.k(this.e, Separators.RPAREN, sbQ);
    }
}
