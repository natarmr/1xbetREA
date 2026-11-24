package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class bih {
    public static final aih Companion = new aih();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2659a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ bih(int i, Boolean bool, Integer num, Long l) {
        if ((i & 1) == 0) {
            this.f2659a = null;
        } else {
            this.f2659a = l;
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
        if (!(obj instanceof bih)) {
            return false;
        }
        bih bihVar = (bih) obj;
        return Intrinsics.d(this.f2659a, bihVar.f2659a) && Intrinsics.d(this.b, bihVar.b) && Intrinsics.d(this.c, bihVar.c);
    }

    public final int hashCode() {
        Long l = this.f2659a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(cs0.q(this.b, this.f2659a, "CyberTimerResponse(timeSec=", ", timeDirection=", ", timeRun="), this.c, Separators.RPAREN);
    }
}
