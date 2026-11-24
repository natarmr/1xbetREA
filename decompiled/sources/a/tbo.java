package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class tbo {
    public static final sbo Companion = new sbo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f33674a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new urn((byte) 11)), maz.a(wezVar, new urn((byte) 12))};
    }

    public /* synthetic */ tbo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f33674a = null;
        } else {
            this.f33674a = list;
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
        if (!(obj instanceof tbo)) {
            return false;
        }
        tbo tboVar = (tbo) obj;
        return Intrinsics.d(this.f33674a, tboVar.f33674a) && Intrinsics.d(this.b, tboVar.b);
    }

    public final int hashCode() {
        List list = this.f33674a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f33674a, Separators.RPAREN, this.b);
    }
}
