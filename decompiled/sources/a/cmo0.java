package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cmo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4616a;
    public final List b;

    public cmo0(long j, List list) {
        list.getClass();
        this.f4616a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmo0)) {
            return false;
        }
        cmo0 cmo0Var = (cmo0) obj;
        return this.f4616a == cmo0Var.f4616a && Intrinsics.d(this.b, cmo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4616a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f4616a, "TableTitleModel(id=", ", valueColList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
