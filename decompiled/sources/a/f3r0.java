package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class f3r0 {
    public static final e3r0 Companion = new e3r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8879a;
    public final String b;
    public final String c;

    public /* synthetic */ f3r0(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8879a = null;
        } else {
            this.f8879a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
        if (!(obj instanceof f3r0)) {
            return false;
        }
        f3r0 f3r0Var = (f3r0) obj;
        return Intrinsics.d(this.f8879a, f3r0Var.f8879a) && Intrinsics.d(this.b, f3r0Var.b) && Intrinsics.d(this.c, f3r0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f8879a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f8879a, "TopEventLegendResponse(id=", ", alias=", this.b, ", fullName="), this.c, Separators.RPAREN);
    }
}
