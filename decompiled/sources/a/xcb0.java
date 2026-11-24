package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class xcb0 {
    public static final wcb0 Companion = new wcb0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40638a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new npa0((byte) 10)), maz.a(wezVar, new npa0((byte) 11))};
    }

    public /* synthetic */ xcb0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f40638a = null;
        } else {
            this.f40638a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcb0)) {
            return false;
        }
        xcb0 xcb0Var = (xcb0) obj;
        return Intrinsics.d(this.f40638a, xcb0Var.f40638a) && Intrinsics.d(this.b, xcb0Var.b);
    }

    public final int hashCode() {
        List list = this.f40638a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("PopularHeroesResponse(heroes=", ", teams=", this.f40638a, Separators.RPAREN, this.b);
    }
}
