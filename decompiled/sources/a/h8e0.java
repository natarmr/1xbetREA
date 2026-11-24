package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4e0 f12621a;
    public final List b;
    public final List c;
    public final List d;
    public final j6i0 e;

    public h8e0(y4e0 y4e0Var, List list, List list2, List list3, j6i0 j6i0Var) {
        b1j.B(list, list2, list3);
        this.f12621a = y4e0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = j6i0Var;
    }

    public static h8e0 a(h8e0 h8e0Var, List list, ArrayList arrayList) {
        y4e0 y4e0Var = h8e0Var.f12621a;
        List list2 = h8e0Var.b;
        j6i0 j6i0Var = h8e0Var.e;
        list2.getClass();
        return new h8e0(y4e0Var, list2, list, arrayList, j6i0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8e0)) {
            return false;
        }
        h8e0 h8e0Var = (h8e0) obj;
        return this.f12621a.equals(h8e0Var.f12621a) && Intrinsics.d(this.b, h8e0Var.b) && Intrinsics.d(this.c, h8e0Var.c) && Intrinsics.d(this.d, h8e0Var.d) && Intrinsics.d(this.e, h8e0Var.e);
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(dw9.a(this.f12621a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        j6i0 j6i0Var = this.e;
        return iA + (j6i0Var == null ? 0 : j6i0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingTableModel(headerModel=");
        sb.append(this.f12621a);
        sb.append(", columnHeaderModelList=");
        sb.append(this.b);
        sb.append(", rowHeaderModelList=");
        b1j.y(", rowsModel=", ", selectorsModel=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
