package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mnr0 {
    public static final knr0 Companion = new knr0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22103a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new dfr0((byte) 19)), maz.a(wezVar, new dfr0((byte) 21))};
    }

    public /* synthetic */ mnr0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f22103a = null;
        } else {
            this.f22103a = list;
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
        if (!(obj instanceof mnr0)) {
            return false;
        }
        mnr0 mnr0Var = (mnr0) obj;
        return Intrinsics.d(this.f22103a, mnr0Var.f22103a) && Intrinsics.d(this.b, mnr0Var.b);
    }

    public final int hashCode() {
        List list = this.f22103a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f22103a, Separators.RPAREN, this.b);
    }
}
