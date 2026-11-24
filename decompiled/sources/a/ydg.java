package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ydg {
    public static final xdg Companion = new xdg();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42435a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new jcg((byte) 7)), maz.a(wezVar, new jcg((byte) 8))};
    }

    public /* synthetic */ ydg(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f42435a = null;
        } else {
            this.f42435a = list;
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
        if (!(obj instanceof ydg)) {
            return false;
        }
        ydg ydgVar = (ydg) obj;
        return Intrinsics.d(this.f42435a, ydgVar.f42435a) && Intrinsics.d(this.b, ydgVar.b);
    }

    public final int hashCode() {
        List list = this.f42435a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("CyberChampResultsByDateResponse(calendar=", ", champGameResults=", this.f42435a, Separators.RPAREN, this.b);
    }
}
