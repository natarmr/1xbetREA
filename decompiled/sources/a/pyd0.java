package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class pyd0 {
    public static final oyd0 Companion = new oyd0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27799a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{null, maz.a(wezVar, new etd0((byte) 9)), maz.a(wezVar, new etd0((byte) 10))};
    }

    public /* synthetic */ pyd0(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.f27799a = null;
        } else {
            this.f27799a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyd0)) {
            return false;
        }
        pyd0 pyd0Var = (pyd0) obj;
        return Intrinsics.d(this.f27799a, pyd0Var.f27799a) && Intrinsics.d(this.b, pyd0Var.b) && Intrinsics.d(this.c, pyd0Var.c);
    }

    public final int hashCode() {
        String str = this.f27799a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("RainbowSixStatisticResponse(currentMapName=", this.f27799a, ", previousMaps=", this.b, ", mapDrafts="), this.c, Separators.RPAREN);
    }
}
