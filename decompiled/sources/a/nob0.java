package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23860a;
    public final double b;
    public final double c;
    public final List d;
    public final List e;

    public nob0(int i, double d, double d2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f23860a = i;
        this.b = d;
        this.c = d2;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nob0)) {
            return false;
        }
        nob0 nob0Var = (nob0) obj;
        return this.f23860a == nob0Var.f23860a && Double.compare(this.b, nob0Var.b) == 0 && Double.compare(this.c, nob0Var.c) == 0 && Intrinsics.d(this.d, nob0Var.d) && Intrinsics.d(this.e, nob0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(brm0.d(this.c, brm0.d(this.b, Integer.hashCode(this.f23860a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerBetModel(type=");
        sb.append(this.f23860a);
        sb.append(", param=");
        sb.append(this.b);
        ohs0.A(sb, this.c, ", sum=", ", params=");
        return kng0.n(", playerNames=", Separators.RPAREN, sb, this.d, this.e);
    }
}
