package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bmo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2845a;
    public final List b;

    public bmo0(long j, List list) {
        list.getClass();
        this.f2845a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmo0)) {
            return false;
        }
        bmo0 bmo0Var = (bmo0) obj;
        return this.f2845a == bmo0Var.f2845a && Intrinsics.d(this.b, bmo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f2845a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f2845a, "TableTitleModel(id=", ", valueColList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
