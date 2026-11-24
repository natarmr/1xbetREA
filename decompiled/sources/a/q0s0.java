package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class q0s0 {
    public static final p0s0 Companion = new p0s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f27919a;
    public final Integer b;

    public /* synthetic */ q0s0(int i, Float f, Integer num) {
        if ((i & 1) == 0) {
            this.f27919a = null;
        } else {
            this.f27919a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0s0)) {
            return false;
        }
        q0s0 q0s0Var = (q0s0) obj;
        return Intrinsics.d(this.f27919a, q0s0Var.f27919a) && Intrinsics.d(this.b, q0s0Var.b);
    }

    public final int hashCode() {
        Float f = this.f27919a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TournamentCsFeedStatisticTopPlayerScoreResponse(rating=" + this.f27919a + ", maps=" + this.b + Separators.RPAREN;
    }
}
