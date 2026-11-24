package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class dan0 {
    public static final can0 Companion = new can0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5758a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ dan0(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f5758a = null;
        } else {
            this.f5758a = l;
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
        if (!(obj instanceof dan0)) {
            return false;
        }
        dan0 dan0Var = (dan0) obj;
        return Intrinsics.d(this.f5758a, dan0Var.f5758a) && Intrinsics.d(this.b, dan0Var.b) && Intrinsics.d(this.c, dan0Var.c);
    }

    public final int hashCode() {
        Long l = this.f5758a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.q(this.b, this.f5758a, "SubscriptionTimerResponse(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
