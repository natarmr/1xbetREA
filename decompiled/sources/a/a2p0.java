package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a2p0 {
    public static final z1p0 Companion = new z1p0();
    public static final a8z[] e = {maz.a(wez.f39042a, new fno0(10)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134a;
    public final Long b;
    public final Long c;
    public final r1p0 d;

    public /* synthetic */ a2p0(int i, List list, Long l, Long l2, r1p0 r1p0Var) {
        if ((i & 1) == 0) {
            this.f134a = null;
        } else {
            this.f134a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r1p0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2p0)) {
            return false;
        }
        a2p0 a2p0Var = (a2p0) obj;
        return Intrinsics.d(this.f134a, a2p0Var.f134a) && Intrinsics.d(this.b, a2p0Var.b) && Intrinsics.d(this.c, a2p0Var.c) && Intrinsics.d(this.d, a2p0Var.d);
    }

    public final int hashCode() {
        List list = this.f134a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        r1p0 r1p0Var = this.d;
        return iHashCode3 + (r1p0Var != null ? r1p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TeamBetStatisticResponse(teams=" + this.f134a + ", sportId=" + this.b + ", subSportId=" + this.c + ", response=" + this.d + Separators.RPAREN;
    }
}
