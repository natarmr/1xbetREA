package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class pv6 {
    public static final ov6 Companion = new ov6();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27648a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new lg6((byte) 17)), maz.a(wezVar, new lg6((byte) 18))};
    }

    public /* synthetic */ pv6(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f27648a = null;
        } else {
            this.f27648a = list;
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
        if (!(obj instanceof pv6)) {
            return false;
        }
        pv6 pv6Var = (pv6) obj;
        return Intrinsics.d(this.f27648a, pv6Var.f27648a) && Intrinsics.d(this.b, pv6Var.b);
    }

    public final int hashCode() {
        List list = this.f27648a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f27648a, Separators.RPAREN, this.b);
    }
}
