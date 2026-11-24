package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rnq0 {
    public static final mnq0 Companion = new mnq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f30801a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ rnq0(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f30801a = null;
        } else {
            this.f30801a = l;
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
        if (!(obj instanceof rnq0)) {
            return false;
        }
        rnq0 rnq0Var = (rnq0) obj;
        return Intrinsics.d(this.f30801a, rnq0Var.f30801a) && Intrinsics.d(this.b, rnq0Var.b) && Intrinsics.d(this.c, rnq0Var.c);
    }

    public final int hashCode() {
        Long l = this.f30801a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.q(this.b, this.f30801a, "TimerResponse(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
