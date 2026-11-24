package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class d8p {
    public static final c8p Companion = new c8p();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5662a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new r4p((byte) 7)), maz.a(wezVar, new r4p((byte) 8))};
    }

    public /* synthetic */ d8p(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f5662a = null;
        } else {
            this.f5662a = list;
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
        if (!(obj instanceof d8p)) {
            return false;
        }
        d8p d8pVar = (d8p) obj;
        return Intrinsics.d(this.f5662a, d8pVar.f5662a) && Intrinsics.d(this.b, d8pVar.b);
    }

    public final int hashCode() {
        List list = this.f5662a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f5662a, Separators.RPAREN, this.b);
    }
}
