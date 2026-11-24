package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class uko0 {
    public static final qko0 Companion = new qko0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35838a;
    public final List b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new dco0((byte) 12)), maz.a(wezVar, new dco0((byte) 16)), maz.a(wezVar, new dco0((byte) 20)), maz.a(wezVar, new dco0((byte) 23))};
    }

    public /* synthetic */ uko0(int i, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f35838a = null;
        } else {
            this.f35838a = list;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uko0)) {
            return false;
        }
        uko0 uko0Var = (uko0) obj;
        return Intrinsics.d(this.f35838a, uko0Var.f35838a) && Intrinsics.d(this.b, uko0Var.b) && Intrinsics.d(this.c, uko0Var.c) && Intrinsics.d(this.d, uko0Var.d);
    }

    public final int hashCode() {
        List list = this.f35838a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return kng0.n(", footer=", Separators.RPAREN, w6x.t("TableResponse(tag=", ", tableTitlesList=", this.f35838a, ", tableBodyList=", this.b), this.c, this.d);
    }
}
