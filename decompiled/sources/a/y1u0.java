package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class y1u0 {
    public static final x1u0 Companion = new x1u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f41878a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final Float f;

    public /* synthetic */ y1u0(int i, Long l, Integer num, Integer num2, Integer num3, Long l2, Float f) {
        if ((i & 1) == 0) {
            this.f41878a = null;
        } else {
            this.f41878a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1u0)) {
            return false;
        }
        y1u0 y1u0Var = (y1u0) obj;
        return Intrinsics.d(this.f41878a, y1u0Var.f41878a) && Intrinsics.d(this.b, y1u0Var.b) && Intrinsics.d(this.c, y1u0Var.c) && Intrinsics.d(this.d, y1u0Var.d) && Intrinsics.d(this.e, y1u0Var.e) && Intrinsics.d(this.f, y1u0Var.f);
    }

    public final int hashCode() {
        Long l = this.f41878a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.f;
        return iHashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f41878a, "ValorantTeamStatisticResponse(teamId=", ", combatScoreAvg=", ", roundWins=");
        rz4.y(sbQ, this.c, ", kills=", this.d, ", damage=");
        sbQ.append(this.e);
        sbQ.append(", economy=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
