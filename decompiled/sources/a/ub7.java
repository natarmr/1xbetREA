package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ub7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35366a;
    public final long b;
    public final String c;

    public ub7(String str, int i, long j) {
        str.getClass();
        this.f35366a = i;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub7)) {
            return false;
        }
        ub7 ub7Var = (ub7) obj;
        return this.f35366a == ub7Var.f35366a && this.b == ub7Var.b && Intrinsics.d(this.c, ub7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Integer.hashCode(this.f35366a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(vqd.q(this.f35366a, this.b, "BetInfoSaleGlobalChampModel(coefTypeId=", ", userBonusId="), ", globalChampId=", this.c, Separators.RPAREN);
    }
}
