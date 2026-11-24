package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mg50 {
    public static final lg50 Companion = new lg50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f21726a;
    public final Long b;

    public /* synthetic */ mg50(int i, Long l, Long l2) {
        if ((i & 1) == 0) {
            this.f21726a = null;
        } else {
            this.f21726a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg50)) {
            return false;
        }
        mg50 mg50Var = (mg50) obj;
        return Intrinsics.d(this.f21726a, mg50Var.f21726a) && Intrinsics.d(this.b, mg50Var.b);
    }

    public final int hashCode() {
        Long l = this.f21726a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "NearestGameDetailsFullScoreDetailResponse(scoreOpp1=" + this.f21726a + ", scoreOpp2=" + this.b + Separators.RPAREN;
    }
}
