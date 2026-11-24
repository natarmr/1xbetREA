package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ndo {
    public static final mdo Companion = new mdo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23344a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new urn((byte) 18)), maz.a(wezVar, new urn((byte) 19))};
    }

    public /* synthetic */ ndo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f23344a = null;
        } else {
            this.f23344a = list;
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
        if (!(obj instanceof ndo)) {
            return false;
        }
        ndo ndoVar = (ndo) obj;
        return Intrinsics.d(this.f23344a, ndoVar.f23344a) && Intrinsics.d(this.b, ndoVar.b);
    }

    public final int hashCode() {
        List list = this.f23344a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f23344a, Separators.RPAREN, this.b);
    }
}
