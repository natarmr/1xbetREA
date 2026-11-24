package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qle0 {
    public static final ple0 Companion = new ple0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mle0 f28930a;
    public final Integer b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    public /* synthetic */ qle0(int i, mle0 mle0Var, Integer num, Double d, Double d2, Double d3, Double d4, Double d5, Integer num2, Integer num3, Integer num4) {
        if ((i & 1) == 0) {
            this.f28930a = null;
        } else {
            this.f28930a = mle0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qle0)) {
            return false;
        }
        qle0 qle0Var = (qle0) obj;
        return Intrinsics.d(this.f28930a, qle0Var.f28930a) && Intrinsics.d(this.b, qle0Var.b) && Intrinsics.d(this.c, qle0Var.c) && Intrinsics.d(this.d, qle0Var.d) && Intrinsics.d(this.e, qle0Var.e) && Intrinsics.d(this.f, qle0Var.f) && Intrinsics.d(this.g, qle0Var.g) && Intrinsics.d(this.h, qle0Var.h) && Intrinsics.d(this.i, qle0Var.i) && Intrinsics.d(this.j, qle0Var.j);
    }

    public final int hashCode() {
        mle0 mle0Var = this.f28930a;
        int iHashCode = (mle0Var == null ? 0 : mle0Var.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.e;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.g;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.j;
        return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RefereeTourInfoResponse(tournament=");
        sb.append(this.f28930a);
        sb.append(", numGames=");
        sb.append(this.b);
        sb.append(", foulsPerGame=");
        vqd.w(sb, this.c, ", foulsPerTackle=", this.d, ", penaltiesAwardedAgainstPerGame=");
        vqd.w(sb, this.e, ", yellowCdsPerGame=", this.f, ", redCdsPerGame=");
        sb.append(this.g);
        sb.append(", yellowCds=");
        sb.append(this.h);
        sb.append(", redCds=");
        return ua80.l(sb, this.i, ", penalties=", this.j, Separators.RPAREN);
    }
}
