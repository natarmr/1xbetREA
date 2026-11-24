package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q0e0 {
    public static final p0e0 Companion = new p0e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27893a;
    public final Integer b;
    public final Integer c;
    public final Float d;
    public final Integer e;

    public /* synthetic */ q0e0(int i, Float f, Integer num, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f27893a = null;
        } else {
            this.f27893a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0e0)) {
            return false;
        }
        q0e0 q0e0Var = (q0e0) obj;
        return Intrinsics.d(this.f27893a, q0e0Var.f27893a) && Intrinsics.d(this.b, q0e0Var.b) && Intrinsics.d(this.c, q0e0Var.c) && Intrinsics.d(this.d, q0e0Var.d) && Intrinsics.d(this.e, q0e0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f27893a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.d;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("RainbowStatisticMatchesTeamPlayerStatsResponse(kills=", this.f27893a, ", deaths=", this.b, ", maps=");
        sbQ.append(this.c);
        sbQ.append(", kost=");
        sbQ.append(this.d);
        sbQ.append(", eps=");
        return dw9.q(sbQ, this.e, Separators.RPAREN);
    }
}
