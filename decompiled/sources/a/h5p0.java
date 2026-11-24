package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class h5p0 {
    public static final g5p0 Companion = new g5p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12493a;
    public final String b;
    public final String c;

    public /* synthetic */ h5p0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f12493a = null;
        } else {
            this.f12493a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5p0)) {
            return false;
        }
        h5p0 h5p0Var = (h5p0) obj;
        return Intrinsics.d(this.f12493a, h5p0Var.f12493a) && Intrinsics.d(this.b, h5p0Var.b) && Intrinsics.d(this.c, h5p0Var.c);
    }

    public final int hashCode() {
        String str = this.f12493a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("TeamChampStatisticInfoResponse(valueTeam1=", this.f12493a, ", valueTeam2=", this.b, ", typeText="), this.c, Separators.RPAREN);
    }
}
