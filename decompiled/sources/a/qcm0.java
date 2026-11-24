package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class qcm0 {
    public static final ocm0 Companion = new ocm0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x9m0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28490a;
    public final List b;

    public /* synthetic */ qcm0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f28490a = null;
        } else {
            this.f28490a = str;
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
        if (!(obj instanceof qcm0)) {
            return false;
        }
        qcm0 qcm0Var = (qcm0) obj;
        return Intrinsics.d(this.f28490a, qcm0Var.f28490a) && Intrinsics.d(this.b, qcm0Var.b);
    }

    public final int hashCode() {
        String str = this.f28490a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("StatisticContentResponse(phaseTitle=", this.f28490a, ", playersStatistic=", this.b, Separators.RPAREN);
    }
}
