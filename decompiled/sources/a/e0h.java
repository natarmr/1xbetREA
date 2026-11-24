package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e0h {
    public static final d0h Companion = new d0h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6988a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;

    public /* synthetic */ e0h(int i, Long l, Long l2, Long l3, Long l4, Integer num) {
        if ((i & 1) == 0) {
            this.f6988a = null;
        } else {
            this.f6988a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0h)) {
            return false;
        }
        e0h e0hVar = (e0h) obj;
        return Intrinsics.d(this.f6988a, e0hVar.f6988a) && Intrinsics.d(this.b, e0hVar.b) && Intrinsics.d(this.c, e0hVar.c) && Intrinsics.d(this.d, e0hVar.d) && Intrinsics.d(this.e, e0hVar.e);
    }

    public final int hashCode() {
        Long l = this.f6988a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f6988a, this.b, "CyberGamesRankingLeaderBoardResponse(mixed=", ", offline=", ", online=");
        cs0.A(sbO, this.c, ", total=", this.d, ", year=");
        return dw9.q(sbO, this.e, Separators.RPAREN);
    }
}
