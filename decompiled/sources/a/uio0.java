package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uio0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35742a;
    public final List b;

    public uio0(long j, List list) {
        list.getClass();
        this.f35742a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uio0)) {
            return false;
        }
        uio0 uio0Var = (uio0) obj;
        return this.f35742a == uio0Var.f35742a && Intrinsics.d(this.b, uio0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f35742a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f35742a, "TableBodyModel(id=", ", valueColBodyList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
