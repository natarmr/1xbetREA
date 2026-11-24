package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xeq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f40755a;
    public List b;
    public final List c;
    public final List d;
    public final List e;

    public xeq0(List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f40755a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeq0)) {
            return false;
        }
        xeq0 xeq0Var = (xeq0) obj;
        return Intrinsics.d(this.f40755a, xeq0Var.f40755a) && Intrinsics.d(this.b, xeq0Var.b) && Intrinsics.d(this.c, xeq0Var.c) && Intrinsics.d(this.d, xeq0Var.d) && Intrinsics.d(this.e, xeq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(dw9.a(dw9.a(this.f40755a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("TileMatchingGameModel(gameField=", ", coeffs=", this.f40755a, ", winningCombination=", this.b);
        b1j.y(", newPositions=", ", fruitBlastBonus=", sbT, this.c, this.d);
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
