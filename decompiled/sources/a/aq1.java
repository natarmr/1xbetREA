package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aq1 implements dq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1275a;
    public final List b;

    public aq1(long j, List list) {
        list.getClass();
        this.f1275a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq1)) {
            return false;
        }
        aq1 aq1Var = (aq1) obj;
        return this.f1275a == aq1Var.f1275a && Intrinsics.d(this.b, aq1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f1275a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f1275a, "Category(partId=", ", brandIds=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
