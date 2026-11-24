package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19407a;
    public final int b;
    public final double c;
    public final int d;
    public final String e;
    public final boolean f;

    public l4i0(int i, int i2, double d, int i3, String str, boolean z) {
        str.getClass();
        this.f19407a = i;
        this.b = i2;
        this.c = d;
        this.d = i3;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4i0)) {
            return false;
        }
        l4i0 l4i0Var = (l4i0) obj;
        return this.f19407a == l4i0Var.f19407a && this.b == l4i0Var.b && Double.compare(this.c, l4i0Var.c) == 0 && this.d == l4i0Var.d && Intrinsics.d(this.e, l4i0Var.e) && this.f == l4i0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(twn.a(this.d, brm0.d(this.c, twn.a(this.b, Integer.hashCode(this.f19407a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("SelectedCellsUiModel(rowCell=", this.f19407a, ", columnCell=", ", winSum=", this.b);
        rz4.w(sbT, this.c, ", cellType=", this.d);
        w6x.z(", gameName=", this.e, ", win=", sbT, this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
