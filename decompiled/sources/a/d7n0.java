package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d7n0 {
    public static final c7n0 Companion = new c7n0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5602a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new a7n0((byte) 0)), maz.a(wezVar, new a7n0((byte) 1))};
    }

    public /* synthetic */ d7n0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f5602a = null;
        } else {
            this.f5602a = list;
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
        if (!(obj instanceof d7n0)) {
            return false;
        }
        d7n0 d7n0Var = (d7n0) obj;
        return Intrinsics.d(this.f5602a, d7n0Var.f5602a) && Intrinsics.d(this.b, d7n0Var.b);
    }

    public final int hashCode() {
        List list = this.f5602a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("SubscriptionEventParamsResponse(params=", ", playerNames=", this.f5602a, Separators.RPAREN, this.b);
    }
}
