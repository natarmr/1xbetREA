package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class rlp0 {
    public static final qlp0 Companion = new qlp0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30710a;
    public final Integer b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new mhp0((byte) 11)), null, maz.a(wezVar, new mhp0((byte) 12))};
    }

    public /* synthetic */ rlp0(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f30710a = null;
        } else {
            this.f30710a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlp0)) {
            return false;
        }
        rlp0 rlp0Var = (rlp0) obj;
        return Intrinsics.d(this.f30710a, rlp0Var.f30710a) && Intrinsics.d(this.b, rlp0Var.b) && Intrinsics.d(this.c, rlp0Var.c);
    }

    public final int hashCode() {
        List list = this.f30710a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(cs0.r(this.b, "TeamStatisticResponse(teams=", ", sportId=", ", response=", this.f30710a), this.c, Separators.RPAREN);
    }

    public rlp0(List list, Integer num, List list2) {
        this.f30710a = list;
        this.b = num;
        this.c = list2;
    }
}
