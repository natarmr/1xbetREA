package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rgo {
    public static final pgo Companion = new pgo();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30448a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new ago((byte) 8)), maz.a(wezVar, new ago((byte) 10))};
    }

    public /* synthetic */ rgo(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f30448a = null;
        } else {
            this.f30448a = list;
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
        if (!(obj instanceof rgo)) {
            return false;
        }
        rgo rgoVar = (rgo) obj;
        return Intrinsics.d(this.f30448a, rgoVar.f30448a) && Intrinsics.d(this.b, rgoVar.b);
    }

    public final int hashCode() {
        List list = this.f30448a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f30448a, Separators.RPAREN, this.b);
    }
}
