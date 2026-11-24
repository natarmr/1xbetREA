package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xz90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41745a;
    public final List b;
    public final int c;
    public final int d;
    public final List e;

    static {
        iun iunVar = iun.f15405a;
        new xz90(0, 0, iunVar, iunVar, iunVar);
    }

    public xz90(int i, int i2, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f41745a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
        this.e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz90)) {
            return false;
        }
        xz90 xz90Var = (xz90) obj;
        return Intrinsics.d(this.f41745a, xz90Var.f41745a) && Intrinsics.d(this.b, xz90Var.b) && this.c == xz90Var.c && this.d == xz90Var.d && Intrinsics.d(this.e, xz90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, dw9.a(this.f41745a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("PlayerCareerModel(teams=", ", tournaments=", this.f41745a, ", sportId=", this.b);
        axq.r(this.c, this.d, ", subSportId=", ", careerTables=", sbT);
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
