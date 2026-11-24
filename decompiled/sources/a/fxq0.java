package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class fxq0 {
    public static final exq0 Companion = new exq0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10322a;
    public final r3r0 b;

    static {
        q3r0 q3r0Var = r3r0.Companion;
        c = new a8z[]{maz.a(wez.f39042a, new joq0((byte) 6)), null};
    }

    public /* synthetic */ fxq0(int i, List list, r3r0 r3r0Var) {
        if ((i & 1) == 0) {
            this.f10322a = null;
        } else {
            this.f10322a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r3r0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxq0)) {
            return false;
        }
        fxq0 fxq0Var = (fxq0) obj;
        return Intrinsics.d(this.f10322a, fxq0Var.f10322a) && Intrinsics.d(this.b, fxq0Var.b);
    }

    public final int hashCode() {
        List list = this.f10322a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        r3r0 r3r0Var = this.b;
        return iHashCode + (r3r0Var != null ? r3r0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Top10PlayersResponse(players=" + this.f10322a + ", response=" + this.b + Separators.RPAREN;
    }
}
