package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class pnq0 {
    public static final knq0 Companion = new knq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27301a;
    public final Integer b;
    public final Boolean c;

    public /* synthetic */ pnq0(int i, Integer num, Integer num2, Boolean bool) {
        if ((i & 1) == 0) {
            this.f27301a = null;
        } else {
            this.f27301a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
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
        if (!(obj instanceof pnq0)) {
            return false;
        }
        pnq0 pnq0Var = (pnq0) obj;
        return Intrinsics.d(this.f27301a, pnq0Var.f27301a) && Intrinsics.d(this.b, pnq0Var.b) && Intrinsics.d(this.c, pnq0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f27301a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return defpackage.c.e(hne.q("TimerResponse(timeSec=", this.f27301a, ", timeDirection=", this.b, ", timeRun="), this.c, Separators.RPAREN);
    }
}
