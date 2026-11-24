package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15436a;
    public final List b;
    public final List c;
    public final List d;
    public final vih0 e;

    public iva(lc00 lc00Var, lc00 lc00Var2, lc00 lc00Var3, List list, vih0 vih0Var) {
        lc00Var.getClass();
        lc00Var2.getClass();
        lc00Var3.getClass();
        list.getClass();
        this.f15436a = lc00Var;
        this.b = lc00Var2;
        this.c = lc00Var3;
        this.d = list;
        this.e = vih0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iva)) {
            return false;
        }
        iva ivaVar = (iva) obj;
        return Intrinsics.d(this.f15436a, ivaVar.f15436a) && Intrinsics.d(this.b, ivaVar.b) && Intrinsics.d(this.c, ivaVar.c) && Intrinsics.d(this.d, ivaVar.d) && this.e.equals(ivaVar.e);
    }

    public final int hashCode() {
        return this.e.d.hashCode() + dw9.a(dw9.a(dw9.a(this.f15436a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CareerTableUiModel(columnHeaderList=", ", rowHeaderList=", this.f15436a, ", dataList=", this.b);
        b1j.y(", totalList=", ", cornerUiModel=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
