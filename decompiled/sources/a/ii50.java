package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ii50 {
    public static final hi50 Companion = new hi50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14813a;
    public final String b;
    public final String c;

    public /* synthetic */ ii50(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14813a = null;
        } else {
            this.f14813a = l;
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
        if (!(obj instanceof ii50)) {
            return false;
        }
        ii50 ii50Var = (ii50) obj;
        return Intrinsics.d(this.f14813a, ii50Var.f14813a) && Intrinsics.d(this.b, ii50Var.b) && Intrinsics.d(this.c, ii50Var.c);
    }

    public final int hashCode() {
        Long l = this.f14813a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f14813a, "NearestGameDetailsSubSportResponse(id=", ", name=", this.b, ", nameEng="), this.c, Separators.RPAREN);
    }
}
