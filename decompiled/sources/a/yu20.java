package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class yu20 {
    public static final xu20 Companion = new xu20();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43248a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new sv10((byte) 27)), maz.a(wezVar, new sv10((byte) 28))};
    }

    public /* synthetic */ yu20(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f43248a = null;
        } else {
            this.f43248a = list;
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
        if (!(obj instanceof yu20)) {
            return false;
        }
        yu20 yu20Var = (yu20) obj;
        return Intrinsics.d(this.f43248a, yu20Var.f43248a) && Intrinsics.d(this.b, yu20Var.b);
    }

    public final int hashCode() {
        List list = this.f43248a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("EventParamsResponse(params=", ", playerNames=", this.f43248a, Separators.RPAREN, this.b);
    }
}
