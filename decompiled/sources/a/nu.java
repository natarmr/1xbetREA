package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class nu {
    public static final mu Companion = new mu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24124a;
    public final Double b;
    public final String c;

    public /* synthetic */ nu(int i, Double d, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24124a = null;
        } else {
            this.f24124a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        return Intrinsics.d(this.f24124a, nuVar.f24124a) && Intrinsics.d(this.b, nuVar.b) && Intrinsics.d(this.c, nuVar.c);
    }

    public final int hashCode() {
        String str = this.f24124a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddTotoBetResponse(message=");
        sb.append(this.f24124a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", totoTicket=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
