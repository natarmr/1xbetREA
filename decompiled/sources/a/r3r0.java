package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class r3r0 {
    public static final q3r0 Companion = new q3r0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29802a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new joq0((byte) 9)), maz.a(wezVar, new joq0((byte) 10))};
    }

    public /* synthetic */ r3r0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f29802a = null;
        } else {
            this.f29802a = list;
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
        if (!(obj instanceof r3r0)) {
            return false;
        }
        r3r0 r3r0Var = (r3r0) obj;
        return Intrinsics.d(this.f29802a, r3r0Var.f29802a) && Intrinsics.d(this.b, r3r0Var.b);
    }

    public final int hashCode() {
        List list = this.f29802a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return cs0.l("TopEventResponse(tabs=", ", legends=", this.f29802a, Separators.RPAREN, this.b);
    }
}
