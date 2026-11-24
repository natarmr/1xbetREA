package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hh6 {
    public static final gh6 Companion = new gh6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh6 f13047a;
    public final wf6 b;

    public /* synthetic */ hh6(int i, xh6 xh6Var, wf6 wf6Var) {
        if ((i & 1) == 0) {
            this.f13047a = null;
        } else {
            this.f13047a = xh6Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = wf6Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh6)) {
            return false;
        }
        hh6 hh6Var = (hh6) obj;
        return Intrinsics.d(this.f13047a, hh6Var.f13047a) && Intrinsics.d(this.b, hh6Var.b);
    }

    public final int hashCode() {
        xh6 xh6Var = this.f13047a;
        int iHashCode = (xh6Var == null ? 0 : xh6Var.hashCode()) * 31;
        wf6 wf6Var = this.b;
        return iHashCode + (wf6Var != null ? wf6Var.hashCode() : 0);
    }

    public final String toString() {
        return "BetBuilderExtendedScoreResponse(innsStats=" + this.f13047a + ", cricketScore=" + this.b + Separators.RPAREN;
    }
}
