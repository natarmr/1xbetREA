package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class u3g {
    public static final t3g Companion = new t3g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f34995a;
    public final Integer b;

    public /* synthetic */ u3g(int i, Integer num, Integer num2) {
        if ((i & 1) == 0) {
            this.f34995a = null;
        } else {
            this.f34995a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3g)) {
            return false;
        }
        u3g u3gVar = (u3g) obj;
        return Intrinsics.d(this.f34995a, u3gVar.f34995a) && Intrinsics.d(this.b, u3gVar.b);
    }

    public final int hashCode() {
        Integer num = this.f34995a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.h("CyberCSMatchesStatisticMatchRoundResponse(winnerTeamId=", this.f34995a, ", winType=", this.b, Separators.RPAREN);
    }
}
