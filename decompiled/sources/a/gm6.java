package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gm6 {
    public static final fm6 Companion = new fm6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11527a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ gm6(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f11527a = null;
        } else {
            this.f11527a = l;
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
        if (!(obj instanceof gm6)) {
            return false;
        }
        gm6 gm6Var = (gm6) obj;
        return Intrinsics.d(this.f11527a, gm6Var.f11527a) && Intrinsics.d(this.b, gm6Var.b) && Intrinsics.d(this.c, gm6Var.c);
    }

    public final int hashCode() {
        Long l = this.f11527a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.q(this.b, this.f11527a, "BetBuilderTimerScoreResponse(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
