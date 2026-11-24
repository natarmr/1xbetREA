package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lk6 {
    public static final kk6 Companion = new kk6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20184a;
    public final String b;
    public final String c;

    public /* synthetic */ lk6(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f20184a = null;
        } else {
            this.f20184a = l;
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
        if (!(obj instanceof lk6)) {
            return false;
        }
        lk6 lk6Var = (lk6) obj;
        return Intrinsics.d(this.f20184a, lk6Var.f20184a) && Intrinsics.d(this.b, lk6Var.b) && Intrinsics.d(this.c, lk6Var.c);
    }

    public final int hashCode() {
        Long l = this.f20184a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f20184a, "BetBuilderOpponentElementResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
