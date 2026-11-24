package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13671a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public hua0(List list, List list2, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f13671a = list;
        this.b = z;
        this.c = list2;
        this.d = z2;
    }

    public static hua0 a(hua0 hua0Var, List list, boolean z, int i) {
        List list2 = hua0Var.f13671a;
        if ((i & 4) != 0) {
            list = hua0Var.c;
        }
        hua0Var.getClass();
        list2.getClass();
        list.getClass();
        return new hua0(list2, list, false, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hua0)) {
            return false;
        }
        hua0 hua0Var = (hua0) obj;
        return Intrinsics.d(this.f13671a, hua0Var.f13671a) && this.b == hua0Var.b && Intrinsics.d(this.c, hua0Var.c) && this.d == hua0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a(brm0.e(this.f13671a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PolybetStateModel(marketInfoModels=" + this.f13671a + ", isLoading=" + this.b + ", rules=" + this.c + ", isError=" + this.d + Separators.RPAREN;
    }
}
