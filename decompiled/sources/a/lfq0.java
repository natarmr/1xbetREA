package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lfq0 extends ofq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19970a;
    public final List b;
    public final List c;

    public lfq0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f19970a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfq0)) {
            return false;
        }
        lfq0 lfq0Var = (lfq0) obj;
        return Intrinsics.d(this.f19970a, lfq0Var.f19970a) && Intrinsics.d(this.b, lfq0Var.b) && Intrinsics.d(this.c, lfq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f19970a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("MakeAction(cells=", ", winCells=", this.f19970a, ", newCells=", this.b), this.c, Separators.RPAREN);
    }
}
