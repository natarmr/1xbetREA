package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lnr0 {
    public static final jnr0 Companion = new jnr0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20361a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new dfr0((byte) 18)), maz.a(wezVar, new dfr0((byte) 20))};
    }

    public /* synthetic */ lnr0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f20361a = null;
        } else {
            this.f20361a = list;
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
        if (!(obj instanceof lnr0)) {
            return false;
        }
        lnr0 lnr0Var = (lnr0) obj;
        return Intrinsics.d(this.f20361a, lnr0Var.f20361a) && Intrinsics.d(this.b, lnr0Var.b);
    }

    public final int hashCode() {
        List list = this.f20361a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f20361a, Separators.RPAREN, this.b);
    }
}
