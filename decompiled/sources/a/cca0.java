package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4101a;
    public final List b;
    public final List c;

    public cca0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f4101a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cca0)) {
            return false;
        }
        cca0 cca0Var = (cca0) obj;
        return Intrinsics.d(this.f4101a, cca0Var.f4101a) && Intrinsics.d(this.b, cca0Var.b) && Intrinsics.d(this.c, cca0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f4101a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("PlayerTennisMenuModel(playerTennisMenuItem=", ", teams=", this.f4101a, ", playerModel=", this.b), this.c, Separators.RPAREN);
    }
}
