package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qje0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f28835a;
    public final List b;
    public final List c;

    public qje0(List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f28835a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qje0)) {
            return false;
        }
        qje0 qje0Var = (qje0) obj;
        return Intrinsics.d(this.f28835a, qje0Var.f28835a) && Intrinsics.d(this.b, qje0Var.b) && Intrinsics.d(this.c, qje0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f28835a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(w6x.t("RefereeTeamModel(teams=", ", players=", this.f28835a, ", info=", this.b), this.c, Separators.RPAREN);
    }
}
