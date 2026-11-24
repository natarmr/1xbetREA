package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gs30 implements is30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11810a;
    public final int b;
    public final List c;
    public final List d;
    public final int e;
    public final ht30 f;

    public gs30(int i, int i2, List list, List list2, int i3, ht30 ht30Var) {
        list.getClass();
        list2.getClass();
        this.f11810a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = i3;
        this.f = ht30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs30)) {
            return false;
        }
        gs30 gs30Var = (gs30) obj;
        return this.f11810a == gs30Var.f11810a && this.b == gs30Var.b && Intrinsics.d(this.c, gs30Var.c) && Intrinsics.d(this.d, gs30Var.d) && this.e == gs30Var.e && this.f == gs30Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, dw9.a(dw9.a(twn.a(this.b, Integer.hashCode(this.f11810a) * 31, 31), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("OpenCell(cell=", this.f11810a, ", index=", ", cellList=", this.b);
        b1j.y(", hintList=", ", sportId=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", sportType=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
