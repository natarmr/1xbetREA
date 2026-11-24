package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ppp0 extends rpp0 {
    public final Pair e;
    public final Pair f;
    public final String g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppp0(Pair pair, Pair pair2, String str, String str2) {
        super(((Number) pair.f46059a).longValue(), ((Number) pair2.f46059a).longValue(), str, str2);
        str.getClass();
        str2.getClass();
        this.e = pair;
        this.f = pair2;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppp0)) {
            return false;
        }
        ppp0 ppp0Var = (ppp0) obj;
        return this.e.equals(ppp0Var.e) && this.f.equals(ppp0Var.f) && Intrinsics.d(this.g, ppp0Var.g) && Intrinsics.d(this.h, ppp0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PairTeamsModel(teamPairOneIds=");
        sb.append(this.e);
        sb.append(", teamPairTwoIds=");
        sb.append(this.f);
        sb.append(", teamPairOneName=");
        return ua80.m(sb, this.g, ", teamPairTwoName=", this.h, Separators.RPAREN);
    }
}
