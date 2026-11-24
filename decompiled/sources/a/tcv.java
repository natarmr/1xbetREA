package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class tcv {
    public static final scv Companion = new scv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33737a;
    public final ocv b;

    static {
        ncv ncvVar = ocv.Companion;
    }

    public /* synthetic */ tcv(int i, Integer num, ocv ocvVar) {
        if ((i & 1) == 0) {
            this.f33737a = null;
        } else {
            this.f33737a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ocvVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcv)) {
            return false;
        }
        tcv tcvVar = (tcv) obj;
        return Intrinsics.d(this.f33737a, tcvVar.f33737a) && Intrinsics.d(this.b, tcvVar.b);
    }

    public final int hashCode() {
        Integer num = this.f33737a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ocv ocvVar = this.b;
        return iHashCode + (ocvVar != null ? ocvVar.hashCode() : 0);
    }

    public final String toString() {
        return "GrandPrixStatisticResponse(sportId=" + this.f33737a + ", response=" + this.b + Separators.RPAREN;
    }
}
