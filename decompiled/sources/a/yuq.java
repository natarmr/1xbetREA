package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class yuq {
    public static final xuq Companion = new xuq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final muq f43280a;
    public final Integer b;

    static {
        luq luqVar = muq.Companion;
    }

    public /* synthetic */ yuq(int i, muq muqVar, Integer num) {
        if ((i & 1) == 0) {
            this.f43280a = null;
        } else {
            this.f43280a = muqVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yuq)) {
            return false;
        }
        yuq yuqVar = (yuq) obj;
        return Intrinsics.d(this.f43280a, yuqVar.f43280a) && Intrinsics.d(this.b, yuqVar.b);
    }

    public final int hashCode() {
        muq muqVar = this.f43280a;
        int iHashCode = (muqVar == null ? 0 : muqVar.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ForecastStatisticResponse(response=" + this.f43280a + ", sportId=" + this.b + Separators.RPAREN;
    }
}
