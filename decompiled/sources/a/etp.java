package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class etp {
    public static final dtp Companion = new dtp();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dfp(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8386a;
    public final List b;

    public /* synthetic */ etp(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f8386a = null;
        } else {
            this.f8386a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof etp)) {
            return false;
        }
        etp etpVar = (etp) obj;
        return Intrinsics.d(this.f8386a, etpVar.f8386a) && Intrinsics.d(this.b, etpVar.b);
    }

    public final int hashCode() {
        Integer num = this.f8386a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f8386a, "FightRoundStatsResponse(roundNumber=", ", stats=", Separators.RPAREN, this.b);
    }
}
