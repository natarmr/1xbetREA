package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kwi0 {
    public static final jwi0 Companion = new jwi0();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19004a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new hwi0((byte) 0)), maz.a(wezVar, new hwi0((byte) 1)), maz.a(wezVar, new hwi0((byte) 2)), maz.a(wezVar, new hwi0((byte) 3)), maz.a(wezVar, new hwi0((byte) 4))};
    }

    public /* synthetic */ kwi0(int i, List list, List list2, List list3, List list4, List list5) {
        if ((i & 1) == 0) {
            this.f19004a = null;
        } else {
            this.f19004a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwi0)) {
            return false;
        }
        kwi0 kwi0Var = (kwi0) obj;
        return Intrinsics.d(this.f19004a, kwi0Var.f19004a) && Intrinsics.d(this.b, kwi0Var.b) && Intrinsics.d(this.c, kwi0Var.c) && Intrinsics.d(this.d, kwi0Var.d) && Intrinsics.d(this.e, kwi0Var.e);
    }

    public final int hashCode() {
        List list = this.f19004a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        return iHashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("Settings(othersMenu=", ", whiteListCountries=", this.f19004a, ", blackListCountries=", this.b);
        b1j.y(", onboardingSections=", ", hiddenCountriesInProfile=", sbT, this.c, this.d);
        return dw9.r(sbT, this.e, Separators.RPAREN);
    }
}
