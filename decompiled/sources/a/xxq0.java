package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xxq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f41671a;
    public final j1r0 b;
    public final List c;

    public xxq0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f41671a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static xxq0 b(xxq0 xxq0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = xxq0Var.f41671a;
        if ((i & 4) != 0) {
            list = xxq0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new xxq0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxq0)) {
            return false;
        }
        xxq0 xxq0Var = (xxq0) obj;
        return this.f41671a.equals(xxq0Var.f41671a) && this.b.equals(xxq0Var.b) && Intrinsics.d(this.c, xxq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f41671a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopAggregatorCategoriesState(contentType=", this.f41671a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
