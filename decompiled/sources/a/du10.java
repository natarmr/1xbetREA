package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class du10 {
    public static final tt10 Companion = new tt10();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6680a;
    public final Long b;
    public final cu10 c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new gf10((byte) 16)), null, null, maz.a(wezVar, new gf10((byte) 17))};
    }

    public /* synthetic */ du10(int i, List list, Long l, cu10 cu10Var, List list2) {
        if ((i & 1) == 0) {
            this.f6680a = null;
        } else {
            this.f6680a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cu10Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du10)) {
            return false;
        }
        du10 du10Var = (du10) obj;
        return Intrinsics.d(this.f6680a, du10Var.f6680a) && Intrinsics.d(this.b, du10Var.b) && Intrinsics.d(this.c, du10Var.c) && Intrinsics.d(this.d, du10Var.d);
    }

    public final int hashCode() {
        List list = this.f6680a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        cu10 cu10Var = this.c;
        int iHashCode3 = (iHashCode2 + (cu10Var == null ? 0 : cu10Var.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "MainFeedChampsByCountryResponse(countries=" + this.f6680a + ", gamesCount=" + this.b + ", sport=" + this.c + ", tabs=" + this.d + Separators.RPAREN;
    }
}
