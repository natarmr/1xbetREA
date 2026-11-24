package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ig50 {
    public static final hg50 Companion = new hg50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg50 f14720a;
    public final eg50 b;

    public /* synthetic */ ig50(int i, qg50 qg50Var, eg50 eg50Var) {
        if ((i & 1) == 0) {
            this.f14720a = null;
        } else {
            this.f14720a = qg50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eg50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig50)) {
            return false;
        }
        ig50 ig50Var = (ig50) obj;
        return Intrinsics.d(this.f14720a, ig50Var.f14720a) && Intrinsics.d(this.b, ig50Var.b);
    }

    public final int hashCode() {
        qg50 qg50Var = this.f14720a;
        int iHashCode = (qg50Var == null ? 0 : qg50Var.hashCode()) * 31;
        eg50 eg50Var = this.b;
        return iHashCode + (eg50Var != null ? eg50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NearestGameDetailsExtendedScoreResponse(innsStats=" + this.f14720a + ", cricketScore=" + this.b + Separators.RPAREN;
    }
}
