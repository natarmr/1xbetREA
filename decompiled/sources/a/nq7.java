package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nq7 {
    public static final mq7 Companion = new mq7();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23946a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new t07((byte) 27)), maz.a(wezVar, new t07((byte) 28))};
    }

    public /* synthetic */ nq7(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f23946a = null;
        } else {
            this.f23946a = list;
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
        if (!(obj instanceof nq7)) {
            return false;
        }
        nq7 nq7Var = (nq7) obj;
        return Intrinsics.d(this.f23946a, nq7Var.f23946a) && Intrinsics.d(this.b, nq7Var.b);
    }

    public final int hashCode() {
        List list = this.f23946a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f23946a, Separators.RPAREN, this.b);
    }
}
