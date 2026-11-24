package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17470a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public k0j0(List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f17470a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0j0)) {
            return false;
        }
        k0j0 k0j0Var = (k0j0) obj;
        return Intrinsics.d(this.f17470a, k0j0Var.f17470a) && Intrinsics.d(this.b, k0j0Var.b) && Intrinsics.d(this.c, k0j0Var.c) && Intrinsics.d(this.d, k0j0Var.d) && Intrinsics.d(this.e, k0j0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(dw9.a(dw9.a(this.f17470a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("SettingsConfig(othersMenu=", ", whiteListCountries=", this.f17470a, ", blackListCountries=", this.b);
        b1j.y(", onboardingSections=", ", hiddenCountriesInProfile=", sbT, this.c, this.d);
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
