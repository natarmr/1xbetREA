package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ok1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25384a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public ok1(int i, List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f25384a = list;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = z3;
    }

    public static ok1 a(ok1 ok1Var, List list, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = ok1Var.f25384a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = ok1Var.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = ok1Var.c;
        }
        boolean z5 = z2;
        int i2 = ok1Var.d;
        if ((i & 16) != 0) {
            z3 = ok1Var.e;
        }
        ok1Var.getClass();
        list2.getClass();
        return new ok1(i2, list2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return Intrinsics.d(this.f25384a, ok1Var.f25384a) && this.b == ok1Var.b && this.c == ok1Var.c && this.d == ok1Var.d && this.e == ok1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, brm0.e(brm0.e(this.f25384a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorPublishersState(providersList=");
        sb.append(this.f25384a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        ua80.q(this.d, ", lottieTypeId=", ", isDarkTheme=", sb, this.c);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
