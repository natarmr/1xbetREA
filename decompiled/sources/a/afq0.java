package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class afq0 extends dfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f791a;
    public final List b;
    public final List c;

    public afq0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f791a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afq0)) {
            return false;
        }
        afq0 afq0Var = (afq0) obj;
        return Intrinsics.d(this.f791a, afq0Var.f791a) && Intrinsics.d(this.b, afq0Var.b) && Intrinsics.d(this.c, afq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f791a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("ChangeAllCoeffs(coeffsList=", ", progressList=", this.f791a, ", maxProgressList=", this.b), this.c, Separators.RPAREN);
    }
}
