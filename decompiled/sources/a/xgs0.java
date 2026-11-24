package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xgs0 implements zgs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40854a;
    public final t2z b;

    public xgs0(List list, t2z t2zVar) {
        list.getClass();
        this.f40854a = list;
        this.b = t2zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgs0)) {
            return false;
        }
        xgs0 xgs0Var = (xgs0) obj;
        return Intrinsics.d(this.f40854a, xgs0Var.f40854a) && this.b == xgs0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40854a.hashCode() * 31);
    }

    public final String toString() {
        return "TransactionHistory(transactionModelsList=" + this.f40854a + ", lastTransactionsPageItemState=" + this.b + Separators.RPAREN;
    }
}
