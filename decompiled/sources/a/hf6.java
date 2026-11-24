package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12958a;
    public final int b;
    public final List c;
    public final double d;
    public final boolean e;

    public hf6(int i, int i2, List list, double d, boolean z) {
        list.getClass();
        this.f12958a = i;
        this.b = i2;
        this.c = list;
        this.d = d;
        this.e = z;
    }

    public static hf6 a(hf6 hf6Var, int i, int i2, List list, double d, int i3) {
        if ((i3 & 1) != 0) {
            i = hf6Var.f12958a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            i2 = hf6Var.b;
        }
        int i5 = i2;
        if ((i3 & 4) != 0) {
            list = hf6Var.c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            d = hf6Var.d;
        }
        boolean z = hf6Var.e;
        hf6Var.getClass();
        list2.getClass();
        return new hf6(i4, i5, list2, d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf6)) {
            return false;
        }
        hf6 hf6Var = (hf6) obj;
        return this.f12958a == hf6Var.f12958a && this.b == hf6Var.b && Intrinsics.d(this.c, hf6Var.c) && Double.compare(this.d, hf6Var.d) == 0 && this.e == hf6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.d(this.d, dw9.a(twn.a(this.b, Integer.hashCode(this.f12958a) * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("BetBlockModel(blockId=", this.f12958a, ", blockNumber=", ", listEventsIds=", this.b);
        sbT.append(this.c);
        sbT.append(", blockBet=");
        sbT.append(this.d);
        return f140.n(sbT, ", lobby=", this.e, Separators.RPAREN);
    }
}
