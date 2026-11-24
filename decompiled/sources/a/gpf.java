package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gpf {
    public static final fpf Companion = new fpf();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11680a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new dpf((byte) 0)), maz.a(wezVar, new dpf((byte) 1))};
    }

    public /* synthetic */ gpf(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f11680a = null;
        } else {
            this.f11680a = list;
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
        if (!(obj instanceof gpf)) {
            return false;
        }
        gpf gpfVar = (gpf) obj;
        return Intrinsics.d(this.f11680a, gpfVar.f11680a) && Intrinsics.d(this.b, gpfVar.b);
    }

    public final int hashCode() {
        List list = this.f11680a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("Cs2MapPicksResponse(teams=", ", teamsMaps=", this.f11680a, Separators.RPAREN, this.b);
    }
}
