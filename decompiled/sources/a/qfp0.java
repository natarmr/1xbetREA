package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qfp0 {
    public static final pfp0 Companion = new pfp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28648a;
    public final Long b;
    public final hfp0 c;

    public /* synthetic */ qfp0(int i, Long l, Long l2, hfp0 hfp0Var) {
        if ((i & 1) == 0) {
            this.f28648a = null;
        } else {
            this.f28648a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hfp0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfp0)) {
            return false;
        }
        qfp0 qfp0Var = (qfp0) obj;
        return Intrinsics.d(this.f28648a, qfp0Var.f28648a) && Intrinsics.d(this.b, qfp0Var.b) && Intrinsics.d(this.c, qfp0Var.c);
    }

    public final int hashCode() {
        Long l = this.f28648a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        hfp0 hfp0Var = this.c;
        return iHashCode2 + (hfp0Var != null ? hfp0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28648a, this.b, "TeamMenuResponse(sportId=", ", subSportId=", ", response=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
