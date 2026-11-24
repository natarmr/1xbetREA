package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class es30 implements fs30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8311a;
    public final List b;
    public final int c;
    public final int d;

    public es30(int i, int i2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f8311a = list;
        this.b = list2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es30)) {
            return false;
        }
        es30 es30Var = (es30) obj;
        return Intrinsics.d(this.f8311a, es30Var.f8311a) && Intrinsics.d(this.b, es30Var.b) && this.c == es30Var.c && this.d == es30Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, dw9.a(this.f8311a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", sportResName=", Separators.RPAREN, w6x.t("SetCells(cellList=", ", hintList=", this.f8311a, ", sportId=", this.b));
    }
}
