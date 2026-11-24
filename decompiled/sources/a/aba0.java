package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class aba0 {
    public static final xaa0 Companion = new xaa0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new raa0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f570a;
    public final List b;

    public /* synthetic */ aba0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f570a = null;
        } else {
            this.f570a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aba0)) {
            return false;
        }
        aba0 aba0Var = (aba0) obj;
        return Intrinsics.d(this.f570a, aba0Var.f570a) && Intrinsics.d(this.b, aba0Var.b);
    }

    public final int hashCode() {
        String str = this.f570a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("PlayerStatisticResponse(playerId=", this.f570a, ", statistics=", this.b, Separators.RPAREN);
    }
}
