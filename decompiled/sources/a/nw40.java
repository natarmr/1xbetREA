package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24218a;
    public final long b;
    public final List c;
    public final String d;

    public nw40(long j, long j2, String str, List list) {
        str.getClass();
        this.f24218a = j;
        this.b = j2;
        this.c = list;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw40)) {
            return false;
        }
        nw40 nw40Var = (nw40) obj;
        return this.f24218a == nw40Var.f24218a && this.b == nw40Var.b && this.c.equals(nw40Var.c) && Intrinsics.d(this.d, nw40Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(rw2.b(Long.hashCode(this.f24218a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f24218a, "MultiSingleBetDataModel(balanceId=", ", bonusId=");
        hne.x(sbQ, this.b, ", simpleBetDataModelList=", this.c);
        return rw2.o(sbQ, ", couponCode=", this.d, Separators.RPAREN);
    }
}
