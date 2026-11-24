package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rzr0 extends v8b {
    public final int d;
    public final List e;
    public final List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzr0(int i, List list, List list2) {
        super(30, null, null, list2);
        list.getClass();
        list2.getClass();
        this.d = i;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzr0)) {
            return false;
        }
        rzr0 rzr0Var = (rzr0) obj;
        return this.d == rzr0Var.d && Intrinsics.d(this.e, rzr0Var.e) && Intrinsics.d(this.f, rzr0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(Integer.hashCode(this.d) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameStatusData(color=");
        sb.append(this.d);
        sb.append(", value=");
        sb.append(this.e);
        sb.append(", cellContent=");
        return dw9.r(sb, this.f, Separators.RPAREN);
    }
}
