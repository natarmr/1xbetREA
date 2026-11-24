package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cij {
    public static final bij Companion = new bij();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4417a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ cij(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f4417a = null;
        } else {
            this.f4417a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cij)) {
            return false;
        }
        cij cijVar = (cij) obj;
        return Intrinsics.d(this.f4417a, cijVar.f4417a) && Intrinsics.d(this.b, cijVar.b) && Intrinsics.d(this.c, cijVar.c);
    }

    public final int hashCode() {
        Long l = this.f4417a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.q(this.b, this.f4417a, "DayExpressScoreTimer(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
