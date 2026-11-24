package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class s95 {
    public static final m95 Companion = new m95();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31837a;
    public final String b;
    public final String c;

    public /* synthetic */ s95(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f31837a = null;
        } else {
            this.f31837a = l;
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
        if (!(obj instanceof s95)) {
            return false;
        }
        s95 s95Var = (s95) obj;
        return Intrinsics.d(this.f31837a, s95Var.f31837a) && Intrinsics.d(this.b, s95Var.b) && Intrinsics.d(this.c, s95Var.c);
    }

    public final int hashCode() {
        Long l = this.f31837a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f31837a, "AvailableValueResponse(value=", ", measure=", this.b, ", valueView="), this.c, Separators.RPAREN);
    }
}
