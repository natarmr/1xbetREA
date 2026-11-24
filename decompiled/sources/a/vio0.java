package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vio0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37489a;
    public final List b;

    public vio0(long j, List list) {
        list.getClass();
        this.f37489a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vio0)) {
            return false;
        }
        vio0 vio0Var = (vio0) obj;
        return this.f37489a == vio0Var.f37489a && Intrinsics.d(this.b, vio0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f37489a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f37489a, "TableBodyModel(id=", ", valueColBodyList=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
