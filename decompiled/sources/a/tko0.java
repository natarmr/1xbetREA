package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tko0 {
    public static final pko0 Companion = new pko0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34106a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new dco0((byte) 11)), maz.a(wezVar, new dco0((byte) 15)), maz.a(wezVar, new dco0((byte) 19))};
    }

    public /* synthetic */ tko0(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f34106a = null;
        } else {
            this.f34106a = list;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tko0)) {
            return false;
        }
        tko0 tko0Var = (tko0) obj;
        return Intrinsics.d(this.f34106a, tko0Var.f34106a) && Intrinsics.d(this.b, tko0Var.b) && Intrinsics.d(this.c, tko0Var.c);
    }

    public final int hashCode() {
        List list = this.f34106a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("TableResponse(columnTitleList=", ", rowList=", this.f34106a, ", footerList=", this.b), this.c, Separators.RPAREN);
    }
}
