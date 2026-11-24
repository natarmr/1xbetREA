package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh0 f24363a;
    public final fza0 b;
    public final List c;

    public nza0(vh0 vh0Var, fza0 fza0Var, List list) {
        vh0Var.getClass();
        list.getClass();
        this.f24363a = vh0Var;
        this.b = fza0Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nza0)) {
            return false;
        }
        nza0 nza0Var = (nza0) obj;
        return Intrinsics.d(this.f24363a, nza0Var.f24363a) && this.b == nza0Var.b && Intrinsics.d(this.c, nza0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24363a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularAggregatorGamesToCategoryModel(categoryModel=");
        sb.append(this.f24363a);
        sb.append(", popularAggregatorCategory=");
        sb.append(this.b);
        sb.append(", games=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
