package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class djf {
    public static final cjf Companion = new cjf();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6183a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new x5f((byte) 22)), maz.a(wezVar, new x5f((byte) 23)), maz.a(wezVar, new x5f((byte) 24))};
    }

    public /* synthetic */ djf(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f6183a = null;
        } else {
            this.f6183a = list;
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
        if (!(obj instanceof djf)) {
            return false;
        }
        djf djfVar = (djf) obj;
        return Intrinsics.d(this.f6183a, djfVar.f6183a) && Intrinsics.d(this.b, djfVar.b) && Intrinsics.d(this.c, djfVar.c);
    }

    public final int hashCode() {
        List list = this.f6183a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(w6x.t("Cs2CompositionResponse(teams=", ", players=", this.f6183a, ", teamStatistic=", this.b), this.c, Separators.RPAREN);
    }
}
