package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class w8s0 {
    public static final v8s0 Companion = new v8s0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new yqr0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38739a;
    public final List b;

    public /* synthetic */ w8s0(int i, Long l, List list) {
        if ((i & 1) == 0) {
            this.f38739a = null;
        } else {
            this.f38739a = l;
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
        if (!(obj instanceof w8s0)) {
            return false;
        }
        w8s0 w8s0Var = (w8s0) obj;
        return Intrinsics.d(this.f38739a, w8s0Var.f38739a) && Intrinsics.d(this.b, w8s0Var.b);
    }

    public final int hashCode() {
        Long l = this.f38739a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TournamentValorantFeedStatisticResponse(id=" + this.f38739a + ", mapPool=" + this.b + Separators.RPAREN;
    }
}
