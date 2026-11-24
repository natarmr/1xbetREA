package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class njf {
    public static final mjf Companion = new mjf();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new x5f(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23632a;
    public final Integer b;
    public final List c;

    public /* synthetic */ njf(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.f23632a = null;
        } else {
            this.f23632a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njf)) {
            return false;
        }
        njf njfVar = (njf) obj;
        return Intrinsics.d(this.f23632a, njfVar.f23632a) && Intrinsics.d(this.b, njfVar.b) && Intrinsics.d(this.c, njfVar.c);
    }

    public final int hashCode() {
        String str = this.f23632a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(axq.p(this.b, "Cs2CompositionStatisticResponse(teamId=", this.f23632a, ", rank=", ", playersStatistic="), this.c, Separators.RPAREN);
    }
}
