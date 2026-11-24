package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ivf {
    public static final gvf Companion = new gvf();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dpf((byte) 13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15443a;
    public final Map b;

    public ivf(int i, long j, Map map) {
        this.f15443a = (i & 1) == 0 ? 0L : j;
        if ((i & 2) != 0) {
            this.b = map;
            return;
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.b = lunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivf)) {
            return false;
        }
        ivf ivfVar = (ivf) obj;
        return this.f15443a == ivfVar.f15443a && Intrinsics.d(this.b, ivfVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f15443a) * 31;
        Map map = this.b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "CurrencyResponse(currencyId=" + this.f15443a + ", vars=" + this.b + Separators.RPAREN;
    }
}
