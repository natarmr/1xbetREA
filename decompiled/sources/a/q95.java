package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class q95 {
    public static final k95 Companion = new k95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28331a;
    public final String b;
    public final String c;

    public /* synthetic */ q95(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28331a = null;
        } else {
            this.f28331a = l;
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
        if (!(obj instanceof q95)) {
            return false;
        }
        q95 q95Var = (q95) obj;
        return Intrinsics.d(this.f28331a, q95Var.f28331a) && Intrinsics.d(this.b, q95Var.b) && Intrinsics.d(this.c, q95Var.c);
    }

    public final int hashCode() {
        Long l = this.f28331a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f28331a, "AvailableValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
