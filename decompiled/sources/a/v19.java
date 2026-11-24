package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36619a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final th1 e;

    public v19(boolean z, boolean z2, boolean z3, List list, th1 th1Var) {
        list.getClass();
        th1Var.getClass();
        this.f36619a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = th1Var;
    }

    public static v19 a(v19 v19Var, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = v19Var.f36619a;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z3 = v19Var.c;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            list = v19Var.d;
        }
        List list2 = list;
        th1 th1Var = v19Var.e;
        list2.getClass();
        th1Var.getClass();
        return new v19(z4, z2, z5, list2, th1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v19)) {
            return false;
        }
        v19 v19Var = (v19) obj;
        return this.f36619a == v19Var.f36619a && this.b == v19Var.b && this.c == v19Var.c && Intrinsics.d(this.d, v19Var.d) && this.e == v19Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.e(brm0.e(Boolean.hashCode(this.f36619a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("BrandsState(isLoading=", ", isInitialLoadFinished=", ", isError=", this.f36619a, this.b);
        vqd.y(sbQ, ", brandsList=", this.d, ", style=", this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
