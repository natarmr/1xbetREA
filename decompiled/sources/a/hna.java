package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13341a;
    public final List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;

    public hna(List list, List list2, boolean z, boolean z2, boolean z3, List list3) {
        b1j.B(list, list2, list3);
        this.f13341a = list;
        this.b = list2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hna)) {
            return false;
        }
        hna hnaVar = (hna) obj;
        return Intrinsics.d(this.f13341a, hnaVar.f13341a) && Intrinsics.d(this.b, hnaVar.b) && this.c == hnaVar.c && this.d == hnaVar.d && this.e == hnaVar.e && Intrinsics.d(this.f, hnaVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(dw9.a(this.f13341a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("CardShortStatisticModel(teamOneImageUrls=", ", teamTwoImageUrls=", this.f13341a, ", pairTeam=", this.b);
        ua80.u(", hostsVsGuests=", ", isMultiTeam=", sbT, this.c, this.d);
        sbT.append(this.e);
        sbT.append(", itemList=");
        sbT.append(this.f);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
