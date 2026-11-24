package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ow50 {
    public static final nw50 Companion = new nw50();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new th50(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25954a;
    public final List b;

    public /* synthetic */ ow50(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f25954a = null;
        } else {
            this.f25954a = str;
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
        if (!(obj instanceof ow50)) {
            return false;
        }
        ow50 ow50Var = (ow50) obj;
        return Intrinsics.d(this.f25954a, ow50Var.f25954a) && Intrinsics.d(this.b, ow50Var.b);
    }

    public final int hashCode() {
        String str = this.f25954a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("NewsResponse(teamId=", this.f25954a, ", newsList=", this.b, Separators.RPAREN);
    }
}
