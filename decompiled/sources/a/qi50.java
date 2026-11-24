package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qi50 {
    public static final pi50 Companion = new pi50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28774a;
    public final Long b;
    public final Boolean c;

    public /* synthetic */ qi50(int i, Long l, Long l2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f28774a = null;
        } else {
            this.f28774a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
        if (!(obj instanceof qi50)) {
            return false;
        }
        qi50 qi50Var = (qi50) obj;
        return Intrinsics.d(this.f28774a, qi50Var.f28774a) && Intrinsics.d(this.b, qi50Var.b) && Intrinsics.d(this.c, qi50Var.c);
    }

    public final int hashCode() {
        Long l = this.f28774a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(rz4.o(this.f28774a, this.b, "NearestGameDetailsTimerResponse(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
