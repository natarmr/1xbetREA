package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jg50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f16464a;
    public final Long b;

    public jg50(Long l, Long l2) {
        this.f16464a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg50)) {
            return false;
        }
        jg50 jg50Var = (jg50) obj;
        return Intrinsics.d(this.f16464a, jg50Var.f16464a) && Intrinsics.d(this.b, jg50Var.b);
    }

    public final int hashCode() {
        Long l = this.f16464a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "NearestGameDetailsFullScoreDetailModel(scoreOpp1=" + this.f16464a + ", scoreOpp2=" + this.b + Separators.RPAREN;
    }
}
